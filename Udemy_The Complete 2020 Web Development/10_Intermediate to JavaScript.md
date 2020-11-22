## Introduction to Javascript
* 자바스크립트: **브라우저** 안에서 모든 걸 할 수 있는 언어.  
그래서 비개발자&비전공자도 아주 쉽게 접할 수 있는 단순한 언어이다.



- 자바vs자바스크립트: **자바-컴파일언어(c, c++...)** vs **자바스크립트-인터프리터언어(python, ruby...)**
* * *

## Functions Part 2: Parameters and Arguments
Math.floor() : 소수점 이하를 버림한다.



Math.ceil() : 소수점 이하를 올림한다.



Math.round() : 소수점 이하를 반올림한다.

* * *

## Comparators and Equality
* '==연산자'는 동등 연산자로, 피연산자가 서로 다른 타입이면 *타입을 강제로 변환*하여 비교한다.

   * 0 == ' ' //true

   * 0 == '0' //true

   * 1 == true //true

   * false == '0' //true

   * null == undefined //true



+ 하지만 '===연산자'는 일치 연산자로, 두 피연산자를 더 *정확하게* 비교한다.

  + 0 === ' ' //false

  + 0 === false //false

  + 1 === true //false

* * *
## Introducing the Leap Year Code Challenge
``` 
function bmiCalculator (w, h) {
 
 
    var bmi=w/Math.pow(h,2);
    return bmi;
}
// BMI계산기 함수
 
    var weight=prompt("What is your weight?");
    var height=prompt("what is your height?");
 
var interpretation = Math.round(bmiCalculator(weight,height));
 
if(interpretation<18.5){
    console.log("Your BMI is < "+interpretation+" >, so you are underweight.");
}
else if(interpretation>=18.5 && interpretation<=24.9){
    console.log("Your BMI is < "+interpretation+" >, so you have a normal weight.");
}
else{
    console.log("Your BMI is < "+interpretation+" >, so you are overweight.");
}
```

* * *
## Leap Year Solution
```
function isLeap(year) {
    
/**************Don't change the code above****************/    
    
    //Write your code here.    
 
// if(year%4!==0){
//     console.log("not leap");
// }
// else{
//     if(year%100!==0){
//         console.log("leap");
//     }
//     else{
//         if(year%400!==0){
//             console.log("not leap");
//         }
//         else{
//             console.log("leap");
//         }
//     }
    
// }
 
if(year%4===0 && year%100!==0){
  console.log("Leap");
}
else if(year%4===0 && year%100===0 && year%400===0){
  console.log("Leap");
}
else{
  console.log("Not Leap");
}
  

}

isLeap(7600);
 ```  
* * *
## Adding Elements and Intermediate Array Techniques
자바스크립트에서 배열의 push/pop은, 자바의 스택과 같아보임.


 
