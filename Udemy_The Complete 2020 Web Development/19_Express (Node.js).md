## What is EXPRESS?

https://expressjs.com/ko/starter/installing.html
// express로 node.js 시작하기

-------------
## Understanding and Working with Routes
nodemon 모듈: atom에서 코드를 수정하고 저장하면 바로바로 적용됨

```
(Hyper)
nodemon server.js
```

body-parser 모듈: 클라이언트 POST request data의 body로부터 파라미터를 편리하게 추출함

```
const express = require('express');
const bodyParser = require('body-parser'); // body-parser 모듈 호출
 
var app = express();
app.use(bodyParser.urlencoded({extended: true})) //
 
app.post("/", function(req, res){
    console.log(req.body);
    //res.send(req.body.num1);
```

---------

## Responding to Requests with HTML Files

__dirname: 현재 실행 중인 폴더 경로

__filename: 현재 실행 중인 파일 경로


이것이 왜 필요하나?

-> 디렉토리가 이동되었을 경우 혹은 다른 사용자의 컴퓨터에서도

    파일/폴더 경로를 찾을 수 있게 함

```

C:\Users\user\desktop\my-calculator-server\calculator.js
 
 __dirname : C:\Users\user\desktop\my-calculator-server
 __filename : C:\Users\user\desktop\my-calculator-server\calculator.js
```
