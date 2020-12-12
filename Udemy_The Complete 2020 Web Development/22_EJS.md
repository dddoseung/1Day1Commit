## Running Code Inside the EJS Template


.ejs 파일에서

**<% %>** 안에 무조건 **javascript 코드**가 들어가야 한다.

**줄바꿈을 하면 또 <% %>** 해주어야 한다.

```
<% if (user) { %>
  <h2><%= user.name %></h2>
<% } %>
```
-------
## Passing Data from Your Webpage to Your Server

```
response.redirect("/"); // app.get("/")으로 돌아간다 (home route로 돌아간다)

response.redircet("/work") // app.get("/work")으로 돌아간다

<form class="" action="/" method=post> // form 블럭 안에 있는 코드에서 post 호출이 있으면 app.post("/")를 실행한다
...
</form> 
```
------
## The Concept of Scope in the Context of Javascript

	1. var, let은 값을 다시 할당할 수 있지만, const는 한번 할당한 값은 변경할 수 없다

	2. var로 선언한 변수는 선언 전에 사용해도 에러가 나지 않지만 let, const는 에러가 발생한다

	3. var는 이미 선언되어있는 변수를 또 선언해도 에러가 나지 않지만 let, const는 에러가 발생한다

	4. var, let은 변수 선언시 초기 값을 주지 않아도 되지만, const는 반드시 초기값을 할당해야 한다

-------
## Understanding Templating vs. Layouts
```
<%- include("footer") -%> // ==
<%- include footer.ejs -%> // ==
```
// footer.ejs 의 작성한 코드를 고대로 가져온다



__이걸 쓰는 이유: page마다 반복되는 코드를 이 한 줄로 해결할 수 있음__


-------

## Understanding Node Module Exports: How to Pass Functions and Data between Files

__js 파일 간 데이터 및 함수 공유하기__


```
[date.js]


exports.getDate = function(){ //module.exports.getDate = function()...와 같다
  let today = new Date();
 
  let options = {
    weekday: 'long',
    //year: 'numeric',
    month: 'long',
    day: 'numeric'
  };
 
  let day = today.toLocaleDateString("en-US", options);
 
  return day;
}


[app.js]

const datejs = require(__dirname + "/date.js"); // return day;
 
 let day=datejs.getDate();
```
