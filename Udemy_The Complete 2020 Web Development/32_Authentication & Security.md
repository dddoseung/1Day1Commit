## Level 2 - Database Encryption
```
const encrypt = require("mongoose-encryption");
 
const userSchema = new mongoose.Schema ({ 
  email: String,
  password: String
});
 
const secret="Thisisourlittlesecret";
 
userSchema.plugin(encrypt,{secret: secret, encryptedFields: ["password"] });
 // password를 암호화하겠다~
+npm i mongoose-encryption
```

이것만 해주면 데이터베이스에 암호화된 상태로 저장된다.

mongoDB는 이것을 알아서 decryption한다.



---------------------------------------------------------------

## Using Environment Variables to Keep Secrets Safe
#### dotenv를 설정하는 이유는 DB url, 사용자 정보 등을 .env 파일에 숨기기 위함 ####


폴더 내의 .env 파일을 실행하는 함수 _dotenv.config()_
```
//db.js
dotenv.config()
```

**주의사항: .gitignore 안 해주면 말짱 도루묵

```
[app.js]

require('dotenv').config();
 
// const secret="Thisisourlittlesecret." // 이 비밀암호를 .env에 숨김
userSchema.plugin(encrypt,{secret: process.env.SECRET, encryptedFields: ["password"] });
```
+ npm i dotenv

```
[.env]

// 중요정보 저장
SECRET=Thisisourlittlesecret.
API_KEY=shkdikfjaekljdkjl

```
+ touch .env

--------------------------
## Level 3 - Hashing Passwords

	Encryption

	: Password + Key  --(Cipher Method)->  CipherText


	Decryption

	: Password  <-(Cipher Method)--  Key + CipherText

    
<br>

	Hashing (단방향 암호화) // 복호화 불가하므로 좀 더 안전

	: Password --(Hash Function)-> Hash
	
		** but, 모든 암호에 대해 어떤 결과가 나올지 해커가 데이터베이스화(=레인보우 테이블) 해두면 꽝


	Hashing + Salting // salting은 Hashing을 통해 나온 암호를 수만번 해시화 (레인보우 테이블 사용 못하게)

```
const md5 = require("md5");
 
app.post("/register",function(req, res){
  const newUser = new User({
    email: req.body.username,
    password: md5(req.body.password) // md5로 저장
  });
 
app.post("/login",function(req,res){
  const userEmail = req.body.username;
  const userPassword = md5(req.body.password); /// md5 적용
 
  User.findOne({email: userEmail},function(err,foundUser){
    if(!err){
      if(foundUser){
        if(foundUser.password === userPassword){
          res.render("secrets");
        }
      }
    }
  });
})
```
+ npm i md5

--------

## Level 4 - Salting and Hashing Passwords with bcrypt

https://www.npmjs.com/package/bcrypt 참고
```
const bcrypt = require("bcrypt");
const saltRounds = 10; // salt
 
 
app.post("/register",function(req, res){
  bcrypt.hash(req.body.password, saltRounds, function(err, hash) {
      // Store hash in your password DB.
      const newUser = new User({
        email: req.body.username,
        password: hash // hash화 한 것을 저장
      });
 
      newUser.save(function(err){
        if(!err){
          res.render("secrets");
        }
      });
  });
 
app.post("/login",function(req,res){
  const userEmail = req.body.username;
  const userPassword = req.body.password;
 
  User.findOne({email: userEmail},function(err,foundUser){
    if(!err){
      if(foundUser){
        bcrypt.compare(userPassword, foundUser.hash,function(err,result) {
            if(result==true){
              res.render("secrets");
            };
        });
      }
    }
  });
})

```
+ npm i nvm bcrypt

- nvm 설치
https://content.breatheco.de/en/how-to/nvm-install-windows#:~:text=Install%20nvm%20Go%20to%20your,that%20you%20will%20hit%20too

--------------
## Using Passport.js to Add Cookies and Sessions

[세팅하기]
https://www.npmjs.com/package/passport-local-mongoose 참고

```
const session = require('express-session'); // cookies and session
const passport = require('passport');
const passportLocalMongoose = require('passport-local-mongoose');
 
// 위치 중요!
app.use(session({ // initialized(=set up) session
  secret:"Our little Secret.",
  resave: false,
  saveUninitialized: false
}));
 
app.use(passport.initialize()); // initialize passport
app.use(passport.session()); // passport to manage a session
 
const userSchema = new mongoose.Schema ({ //
  email: String,
  password: String
});
 
userSchema.plugin(passportLocalMongoose); // passport-local-mongoose
 
const User = new mongoose.model("User",userSchema);
 
passport.use(User.createStrategy());

// use static serialize and deserialize of model for passport session support
passport.serializeUser(User.serializeUser()); // create cookie and user's identification message
passport.deserializeUser(User.deserializeUser()); // destroy cookie and remove message

```
[register] https://www.npmjs.com/package/passport-local-mongoose 참고
```
app.get("/secrets",function(req,res){
  if(req.isAuthenticated()){ // 권한이 있는 것을 확인하면
    res.render("secrets"); // rendering
  }else{ // 없으면
    res.redirect("/login"); // login창
  }
})
app.post("/register",function(req, res){
  User.register({username: req.body.username}, req.body.password, function(err, user){
    if(err){
      console.log(err);
      res.redirect("/register");
    }else{
      passport.authenticate("local")(req,res,function(){ // passport에 권한 부여
        res.redirect("/secrets"); // 권한 부여 받으면 secrets로 리다이렉트
      })
    }
  })
});

```
[login] http://www.passportjs.org/docs/login/ 참고

```
app.post("/login",function(req,res){
 
  const user = new User({
    username: req.body.username,
    password: req.body.password
  });
 
  req.login(user, function(err){
    if(err){
     console.log(err);
    }else{
     passport.authenticate("local");
     res.redirect("/secrets");
    }
  })
});
 ```

+ npm i passport passport-local passport-local-mongoose express-session

-----------------------------

## Level 6 - OAuth 2.0 & How to Implement Sign In with Google

#### OAuth란?: 인터넷 사용자들이 비밀번호를 제공하지 않고 다른 웹사이트 상의 로그인 정보로 서비스를 이용하는 것

OAuth http://www.passportjs.org/packages/ 참고

_OAuth와 관련된 코드와 설명은 final files와 Udemy강의를 다시 한번 보는 것을 추천!_
