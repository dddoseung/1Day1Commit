## API Authentication and Postman
JSON: 속성-값 쌍(attribute–value) 또는 "키-값 쌍"으로 이루어진
데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는 텍스트를 사용하는 개방형 표준 포맷이다.


본래는 자바스크립트 언어로부터 파생되어 자바스크립트의 구문 형식을 따르지만 언어 독립형 데이터 포맷이다.    

즉, 프로그래밍 언어나 플랫폼에 독립적이므로, 구문 분석 및 JSON 데이터 생성을 위한 코드는 C, C++, C#, 자바, 자바스크립트, 펄, 파이썬 등 수많은 프로그래밍 언어에서 쉽게 이용할 수 있다.


```
{  // Key - Value
2     "이름": "홍길동",
3     "나이": 25,
4     "성별": "여",
5     "주소": "서울특별시 양천구 목동",
6     "특기": ["농구", "도술"],
7     "가족관계": {"#": 2, "아버지": "홍판서", "어머니": "춘섬"},
8     "회사": "경기 수원시 팔달구 우만동"
9  }
```
---------

## How to Parse JSON

JSON.parse(data) 는 string 객체를 json 객체로 변환 (json으로 해석)


```
const json = '{"result":true, "count":42}';
const obj = JSON.parse(json);
 
console.log(obj.count);
// expected output: 42
 
console.log(obj.result);
// expected output: true

```

JSON.stringify(object) 는 json 객체를 String 객체로 변환


```
console.log(JSON.stringify({ x: 5, y: 6 }));
// expected output: "{"x":5,"y":6}"
 
console.log(JSON.stringify([new Number(3), new String('false'), new Boolean(false)]));
// expected output: "[3,"false",false]"
 
console.log(JSON.stringify({ x: [10, undefined, function(){}, Symbol('')] }));
// expected output: "{"x":[10,null,null,null]}"
 
console.log(JSON.stringify(new Date(2006, 0, 2, 15, 4, 5)));
// expected output: ""2006-01-02T15:04:05.000Z""

```
