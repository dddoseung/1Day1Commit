## Introduction to JSX and Babel

JSX(JavaScript XML): javascript를 확장한 문법

 // 위는 react jsx 아래는 html js
 ```
import React from "react";
import ReactDOM from "react-dom";
 
ReactDOM.render( // single HTML Element만 가능하므로
  <div> // div로 묶어서 두 문장 출력
   <h1>Hello, World!</h1>
    <p>It's me.</p>
  </div>,
  document.getElementById("root")
);
 
<!-- ---------------------- -->
 
var h1 = document.createElement("h1");
h1.innerHTML = "Hello, World!";
var p = document.createElement("p");
p.innerHTML = "It's me.";
 
document.getElementById("root").appendChild(h1);
document.getElementById("root").appendChild(p);
```
----------

## Javascript Expressions in JSX & ES6 Template Literals

 // 다 같은 표현
 ```
    <h1>Hello {lname + " " + fname}! </h1> // 일반적 표현
    <h1>Hello {lname} {fname}! </h1> // jsx 표현
    <h1>Hello {`${lname}` +" "+ `${fname}`}! </h1> // jsx+ES6 표현

 ```
------


## JSX Attributes & Styling React Elements
js형식의 파일이 JSX 문법인 것을 전달하기 위해



// [index.html]
```
<body>
    <script src="../src/index.js" type="text/JSX"></script> // JSX
</body>
```

--------------

## React Components
JSX의 가장 큰 장점이자 특징-> __컴포넌트__ 로 표현하는 것

------------------

## [Windows]​ Local Environment Setup for React Development
React 개발환경 셋업하기



1. Node.js 최신버전

2. VSCode 설치

3. vscode-icon, sublime babel 패키지 설치

4. Hyper에 아래 코드입력
```
     npx create-react-app my-app
     cd my-app
     npm start
```
--------------------
## React Props

_[HTML Attributes]_
```
<input id="email" placeholder="enter text" value="abc@dsd.com" />



document.getElementById("email")

.id

.placeholder

.value
```


------------------------------------

_[React Prop]_
```
<Card id="email" tel="01022233333" gender="female" />



function Card(props) {

  return( <div>

       <p>{props.id}</p>

       <p>{props.tel}</p>

       <p>{props.gender}</p>

       </div> )

}
```

---------

## Javascript ES6 Arrow functions

```
const newNumbers = numbers.map( x => {
  return x * 2;
});
//방법 1

const newNumbers = numbers.map( x => x * 2);
//방법 2
```
--------

## Conditional Rendering Practice

JSX의 조건문

```
      {isLoggedIn===false ? <Login /> : <h1>hello</h1>} 

    // or
	
      {isLoggedIn === false && <Login />} // isLoggedIn이 false이면 <Login /> 한다
      {isLoggedIn === true && <h1>Hello</h1>}
```
-----
## useState Hook Practice
```
import React, { useState } from "react";
 
  const [count, setCount] = useState(1);// useState(initialState)
 
  // useState = [initialState, function]
  // this function is to update initialState
```

------
## Javascript ES6 Object & Array Destructuring

```
// 예제 1

const animals = [
  { name: "cat", sound: "meow"},
  { name: "dog", sound: "woof" }
];
-----------------------------------------------------
const [cat, dog] = animals ;
console.log(cat) // {name: "cat", sound: "meow"}
 
const {name, sound} = cat;
const {name: catName, sound: catSound} = cat; // name을 이제부터 catName이라고도 쓰겠다
const {property: "pretty"} = cat; // 만약 없는 변수값이라면 이 변수값을 생성하겠다
 
==================================================================
//예제 2

const [cat, dog] = animals;
console.log(cat) // {name: "cat", sound: "moew" property: { p1: "cute", p2: "pretty"} }
 
const {property: {p1, p2}} = cat;
console.log(p1) // cute
 
function useAnimals(animal) {
   return[
      animal.name,
      function() {
           console.log(animal.sound)
      }
  ];
}
const [name, makeSound] = useAnimals(cat);
console.log(name) // cat
makeSound() // console meow
```

-------------------------

## React Forms

```
<form> 있을 경우


function btnClick(event) {
    tfFunc(current);
 
    event.preventDefault(); // form의 onSubmit의 Default 이벤트 전파를 막음
  }
 
  return (
    <div className="container">
 
      //<form>의 default action은 새로고침되는 것-> 화면에서 정보가 사라짐
      <form onSubmit={btnClick}>
      <h1>Hello {tf}</h1>
      <input onChange={EditWord} type="text" placeholder="What's your name?" />
      <button type="submit">
        Submit
      </button>
      </form>
    </div>
  );
```  

```
<form> 없을 경우


function btnClick() {
    tfFunc(current);
  }
 
  return (
    <div className="container">
      <h1>Hello {tf}</h1>
      <input onChange={EditWord} type="text" placeholder="What's your name?" />
      <button type="submit" onClick={btnClick}>
        Submit
      </button>
    </div>
  );
```
------------------

## Class Components vs. Functional Components

_Should I use Hooks(functions), classes, or a mix of both?_

-> Hook를 권장한다 (간결하며 요새 추구하는 코드스타일)

--------------------

## Managing a Component Tree

[Excuted on Render]
```
<div onClick={props.onChecked(props.idx)}> // 이렇게 하면 click하지 않았는데도 실행됨
```
[Excuted on Click]
```
<div onClick={ () => {props.onChecked(props.idx)}} // 이렇게 함수로 표현해야 trigger가 돼서 click으로 정상 작동됨
```

Render가 Click보다 우선순위가 되므로 함수로 표현해야 한다!

-----------

## Keeper App Project - Part 3

React에서 __여러 input을 입력__ 하고 배열에 저장해야 할 때,

```
const [inputText, setInputText] = useState({ title: "", content: "" }); // 여러 input
 
 function handleInputText(event) {
    const { name, value } = event.target;
 
    setInputText((prevNote) => {
      return {
        ...prevNote, // 중요!
        [name]: value // [배열]이어야 함
      };
    });
  }
 ```
_Keeper Part 3 Starting_ 파일 코드임

-----------------

## React Dependencies & Styling the Keeper App

React는 bootstrap이나 fav-icon과 같은 css library를

package를 다운받아 import해서 바로 사용할 수 있는 장점이 있음
