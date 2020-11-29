## Selecting HTML Elements with Javascript

document.querySelector("#title") = document.getElementById("title")[0] 

-------------


## The Separation of Concerns: Structure vs Style vs Behaviour


```
document.querySelector("#list").classList.add("invisible")

// id="list"인 것에 class="invisible"을 add함 (이 때, 이미 invisible 클래스가 css에 있어야 함)



document.querySelector("#list").classList.remove("invisible")

// id="list"인 것에 class="invisible"을 remove함



document.getElementsByClassName("item")[1].classList.add("huge")

// class="item"인 index=1인 것에 class="huge"를 add함

```

---------
## Text Manipulation and the Text Content Property
```

document.querySelector("h1").innerHTML = "<em>goodBye</em>"

-> goodBye

document.querySelector("h1").textContent = "<em>goodBye</em>" (or innerText)

-> <em> goodBye </em>


   

 * html에서 <em>Hello</em>일 때   
 

document.querySelector("h1").innerHTML

-> "<em>Hello</em>"

document.querySelector("h1").textContent (or innerText)

-> "Hello"

```
**textContent or innerText를 쓰자**

-----------------------------------------------------------------------

##  Adding Event Listeners to a Button

**addEventListener은 이벤트를 등록하는 가장 권장되는 방식이다.**



- $0.addEventListener ("click", function(){

   console.log("I got clicked.");

   });



* $0.addEventListener ("click", function(){

   respondToClick();

    });

   function respondToClick(){

  console.log("I got clicked.");

   }

--------------
## Calculator(계산기) 자바스크립트 버전:


```
function add(num1, num2) {

return num1 + num2;

}



function subtract(num1, num2) {

return num1 - num2;

}



function multiply(num1, num2) {

return num1 * num2;

}



function divide(num1, num2) {

return num1 / num2;

}



function calculator(num1, num2, operator) {

return operator(num1, num2);

}

```
### calculator(30,40,multiply) 이렇게 사용


-------------------------

## 자바스크립트 객체선언


```
var housekeeper1 = {

   name: "Irene",

   number: "01043098322"

}

```

-----------------------------------

## 자바스크립트 생성자선언


```
function bellboy(name, number, address){

   this.name=name;

   this.number=number;

   this.address=address;
   

   this.cleaning = function(){

        alert("clean in progress...");

        move();

        cleanbed();

    }

}


var bell_1 = new bellboy("Timmy", "0101234578", ["강동구","송파구"]);
```

-------------
## Using Keyboard Event Listeners to Check for Key Presses
```

document.addEventListener ("keypress", function(event){ 
// event는 keypress(키보드 입력)에 대한 모든 정보를 담고있음

    makeSound(event.key); // event.key는 무슨 키를 입력했는지 알려줌

});
```

------------

##  Understanding Callbacks and How to Respond to Events

```
function listener(type, callback){
    var tmp={
        key: "p",
        enterType: "keypress"
    }
    if(type === tmp.enterType){
        callback(tmp)
    }
};
 
listener("keypress",function(event){
    console.log(event);
});
 

<결과>
{key: "p", enterType: "keypress"}
enterType: "keypress"
key: "p"

```
