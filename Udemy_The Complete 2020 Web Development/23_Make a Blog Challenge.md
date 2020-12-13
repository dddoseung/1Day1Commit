## Setting Up the Blog Project
1. 필요한 여러 npm 모듈들을 일일히 다운받기 힘듦
2. github이나 구글링을 해서 기본적인 package.json 코드를 긁어오고
3. 내가 필요한 모듈들을 추가한 후
4. hyper에 'npm install'만 해주면 모두 다운 받아짐

-----

## Challenge 15
```
  <% postItems.forEach(function(element){ %>
    <% console.log(element.postTitle) %>
  <% }); %>
<!--  forEach() 메서드는 주어진 함수를 배열 요소 각각에 대해 실행 -->
```
==
```
  <% for (i=0;i<postItems.length;i++) { %>
    <% console.log(postItems[i].postTitle) %>
  <% }; %>
```
------

## Express Routing Parameters
```
app.get("/:parameter",function(req,res){
  console.log(req.params);
}) 

// http://localhost:3000/HI
// 결과 { parameter: 'HI' }
```

```
app.get("/:parameter",function(req,res){
  console.log(req.params.parameter);
}) 

// http://localhost:3000/HI
// 결과 HI
```
