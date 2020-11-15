Section 1: Front-end Web Development   
====
Section 2: Introduction to HTML  
==== 
Section 3: Intermediate to HTML    
====
* * *
-*서버로부터 받는 데이터*는 보통 **HTML/CSS/JavaScript** 이 3가지 타입으로 이루어져 있다.   
---


- HTML: Establish structure my house(ex.toilet, kitchen...)

   = Structure our website(input logo, button, checkbox...)

- CSS: painters and decorators

   =Styling website(red button, font...)

* JavaScript: Connect electrical and plumb toilet

   = Having behavior (웹이 작동하게 만듦)

* * *
-**인터넷** : 24/7 연결되어 있는 스카이 or 도서관이라고 생각하면 된다.
---



+ 인터넷 작동원리:

   내 컴퓨터->브라우저->Internet Service Provider->called DNS Server (=PhoneBook)->

   IP address access->google.com->send back to your browser
   
   

- 인터넷 작동원리(Direct(우리가 사용하는 현재 인터넷)):

   *인터넷 백본을 이용함*

   ->Internet Service Provider->direct send via what's called Internet Backbone(Huge wire connecting WorldWide)


* * *

## 27. Forms in Practice - Create a Contact Me Form



      <form class="" action="mailto:tmdgus0851@naver.com" method="post" enctype="text/plain"> 
      // action="mailto:tmdgus0851@naver.com"은 진짜 메일을 보낼 수 있음 
      // enctype="text/plain"은 인코딩문자가 출력되지 않고 기본형태로 보낼 수 있음

      <label>Your Name:</label>

      <input type="text" name="yourName" value=""><br> // name="yourName"으로 설정하면 메일을 보낼 때 자동으로 yourName= ~ 이 입력되어 있음

      <label>Your Email: </label>

      <input type="email" name="yourEmail" value=""><br> //<br>은 줄바꿈

      <label>Your Message: </label><br>

      <label><em>중요한 메시지이면 체크해주세요</em></label>

      <input type="checkbox" type="color"><br>

      <textarea name="yourMessage" rows="10" cols="30"></textarea> // name="yourMessage"도 마찬가지

---
## 28. Publish Your Website!

Repository 생성해서 파일 업로드한 후

Settings 들어가서 *Github Pages->Source->master branch->save*
