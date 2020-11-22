* dist/css/bootstrap.css-> 부트스트랩에서 지원하는 css 있음. 원하는 폰트, 배경.. 등등

+ docs/4.0/examples/.. -> example 링크에 디렉토리 써져있음

  + ->들어가면 원하는 example 폴더 누르고 index.html이랑 css 수정 하면 됨
* * *


## What is Bootstrap?   
### BootStrap: Front-end library

+ Front-end: USers see, Beautiful Interface

- Back-end: many logic&function...
  - Back-end Language: .NET, RUBY, PHP, NodeJS, SQL, JAVA

*****
## WireFrame
balsamiq.cloud에서 와이어프레임을 해볼 수 있음
*****




## The Bootstrap Navigation Bar

부트스트랩에서 collapse란? 메뉴를 누르면 내용이 펼쳐지는 거 (보통 FAQ나 QnA같은 거!)

Bootstrap의 장점은 화면 사이즈에 맞춰 유동적으로 변한다는 것

BootStrap에서 nav란 html의 div와 비슷한 것

Bootstrap4는 상단에 있는 막대 형식의 메뉴바(네비게이션 바)의 디자인을 제공함

네비게이션 바는 navbar 클래스를 추가해야 함

* * *
## Setting Up Our New Project
Bootstrap->Documentation->css코드 copy해서

TinDog의 "index.html"에 붙여야함


Bootstrap->Documentation->JS Bundle copy해서

TinDog의 "index.html"에 붙여야함

* * *

##  Bootstrap Grid Layout System

.navbar-expand-lg 는 네비바를 lg 즉, 992px 이상일 때 펼친다는 의미

toggle버튼과 상호작용해서 992px 미만일 때 네비바 메뉴가 숨고, 이상일 때 펼쳐진다는 뜻

따라서 lg를 바꿔주면 원하는 너비에서 toggle되게 만들 수 있음


bootstrap->Documentation->Layout->Grid에서 반응형 웹을 구현할 수 있음
* * *
##  Bootstrap Containers
"container"는 모바일(sm)을 제외한 사이즈에서 양 옆 여백이 있음.(안 이쁨)


"container-fluid"는 모든 사이즈에서 width=100%로 꽉 찬 컨테이너임.

* * *

## Styling Our Website Challenges and Solutions

margin: 20px 같은 표현은 상하좌우 모두 20px을 의미합니다

margin: 30px 10px은 상하 30px, 좌우 10px을 의미합니다.

margin: 30px 10px 20px 50px은 위 30px, 오른쪽 10px, 아래 20px, 왼쪽 50px을 의미합니다.

margin: 30px 10px 40px은 위 30px, 좌우 10px, 아래 40px을 의미합니다.

즉 방향의 위부터 시계방향으로 회전하여 위 오른쪽 아래 왼쪽 순서로 설정합니다.

* * *
## The CSS Z-Index and Stacking Order
absolute: 절대위치

- 
부모가 position을 갖고 있지 않을 때:

            -absolute: 몰라 여기 나만 있어 난 나대로 위치해있을거야

            -다른애들: 야 쟤 빼고 우리끼리만 있는대로 행동해(position이 relative일 때도 마찬가지)



- 
부모가 position을 갖고 있을 때:

            -absolute: 부모의 position을 고려해서 위치해있어야 해

* * *
## The CSS Z-Index and Stacking Order
z-index는 position 속성이 설정된 엘리먼트에 대해서만 의미를 갖는다.

: z-index값이 클수록 스택에 가장 위(앞)에 위치한다

* * *
## How to become a Better Programmer - Code Refactoring
Why We need to refactoring?

- Readability

+ Modularity

* Efficiency

- Length

* * *
## Advanced CSS - Selector Priority
-HTML-
```
<h1 id="heading" class="title" style="color: orange;"> Hello World </h1>
```


-CSS-
```

h1{

color: red;

}

#heading{

color: blue;

}

.title{

color: yellow;

}
```


우선순위 1순위: style="color: orange;" (<-HTML)

우선순위 2순위: #heading (<-CSS)

우선순위 3순위: .title (<-CSS)

우선순위 4순위: h1 (<-CSS)
