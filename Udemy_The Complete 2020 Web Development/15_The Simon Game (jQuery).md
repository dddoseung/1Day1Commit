## What is jQuery?

jQuery: 자바스크립트 코드에서 반복적이고 쓸데없이 긴 코드를 효율적으로 줄인 라이브러리

```
document.querySelector("h1")

            vs

         jQuery("h1")

          =$("h1")
			  
```
--------------
## How to Incorporate jQuery into Websites
<br>
console.log($("h1").css("font-size"));

결과: 5px

<br>

$("h1").css("color","red"); // (속성, 원하는 것)

결과: red로 변경됨

<br>

$("h1").addClass("big-title");

결과: styles.css에 .big-title대로 변경됨

<br>

$("h1").addClass("big-title color-title");

결과: styles.css에 .big-title & .color-title 2개 반영되어 변경됨

<br>

$("h1").removeClass("big-title");

결과: 삭제됨

<br>

$("h1").hasClass("color-title");

결과: class가 적용된 상태라면 true

<br>


----

## Manipulating Text with jQuery

```
[자바스크립트]

document.querySelector("h1").innerHTML = "<em>goodBye</em>"

-> goodBye

document.querySelector("h1").textContent = "<em>goodBye</em>" (or innerText)

-> <em>goodBye</em>



[jQuery]

$("h1").html("<em>good bye</em>")

->good bye

&("h1").text("<em>good bye</em>")

-><em>good bye</em>

```
----

## Manipulating Attributes with jQuery

```
[자바스크립트]

<img src="drum.png" alt="">

[jQuery]

$("img").attr("src","piano.png") // (속성, 원하는 것)


[자바스크립트]

<a href="https://www.google.com"></a>

[jQuery]

$("a").attr("href","https://www.naver.com") // (속성, 원하는 것)

```
----------
## Adding Event Listeners with jQuery

 ### add Event Listener ( ex. click / keypress / mouseover .... )

```
<방법1>

$("img").click (function(){

     $("h1").css("color","yellow");

});

<방법2>

$("img").on("click","function(){

    $("h1").css("color","yellow");

});
```
--------
##  Adding and Removing Elements with jQuery
```
$("h1").before("<button>NEW</button>")

-> <button>NEW</button> <h1>hi</h1>



$("h1").after("<button>NEW</button>")

-> <h1>hi</h1> <button>NEW</button>



$("h1").prepend("<button>NEW</button>")

-> <h1> <button>NEW</button> hi </h1>



$("h1").append("<button>NEW</button>")

-> <h1> hi <button>NEW</button> </h1>
```
