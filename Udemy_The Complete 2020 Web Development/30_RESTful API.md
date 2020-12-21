## What is REST?


### app.get(function(req, res){

      -req: client->server (HTTPS request 요청함)

      -res: server->client (callback function(HTML, image... 등) 응답함)


* * *
### -API:

client<->API<->server ( 음식점 메뉴와 같다 (서비스를 제공))

* * *

### -REST:

__api의 아키텍처 스타일__  
<br> 

-RESTful의 주요 특징

   * Use HTTP Request Method: GET/POST/PUT/PATCH/DELETE (like database CRUD)

          -> GET=READ / POST=CREATE / PUT&PATCH=UPDATE (PATCH는 데이터의 한 속성만 업데이트, PUT은 데이터 전체를 통째로 업데이트) / DELETE=DELETE

<Br>

    * Use specific pattern of Routes/Endpoint URLs (사진 참고)

           -> /articles -> all articles
              /articles/JackBauber -> Specific article (계층적이며, URL는 정보의 자원을 표현해야 함)

   
-----------------

## route Method

### app.route 메서드란?

-> URL 규칙을 받아 해당하는 규칙의 URL로 요청이 들어온 경우 등록한 함수를 실행하게끔 설정함
	
```


app.route("/articles")
.get(function(req,res){
  Article.find(function(err,foundArticles){ //findOne(x)
    if(!err){
      res.send(foundArticles);
    } else{
      res.send(err);
    }
  })
}) // not ;
.post(function(req,res){
  console.log(req.body.title);
  console.log(req.body.content);

  const newArticle = new Article({
    title: req.body.title,
    content:req.body.content
  });

  newArticle.save(function(err){
    if(!err){
      res.send("successfully added");
    }else{
      res.send(err);
    }
  });
})
.delete(function(req,res){
  Article.deleteMany(function(err){
    if(!err){
      res.send("successfully deleted");
    }else{
      res.send(err);
    }
  });
});

```
-----------
## POST a New Article

```
* /articles *
```

### [RESTful API -POST-]

postman 실행

POST로 설정하고 주소창에 localhost:3000/articles와 같이 입력

*Body* 부분에 x-www-form-urlencoded로 설정

key-value 입력 (app.js의 req.body.title, req.body.content가 key: title, content가 되는 것임)

Send 버튼 누르면 POST(-> one article) 실행

<Br>

### [RESTful API -DELETE-]

DELETE으로 설정하고 주소창에 localhost:3000/articles와 같이 입력

Send 버튼 누르면 DELETE (-> all articles) 실행

<Br>

### [RESTful API -GET-]

GET으로 설정하고 주소창에 localhost:3000/articles와 같이 입력

Send 버튼 누르면 GET (-> all articles) 실행

---------------

## Chained Route Handlers Using Express
```
* articles/JackBauber *
```

### [RESTful API -PATCH-] // 데이터 객체의 한 속성만 업뎃

PATCH로 설정하고 주소창에 localhost:3000/articles/test와 같이 입력

Send 버튼 누르면 PATCH (-> test의 특정 속성) 실행

app.js에서는 바꾸고 싶은 속성 {$set: }

<br>


### [RESTful API -PUT-] // 데이터 객체 통째로 업뎃

PUT으로 설정하고 주소창에 localhost:3000/articles/test와 같이 입력

Send 버튼 누르면 PUT(-> test의 전체 속성) 실행


