## ROBO 3T & MongoDB Atlas

_ROBO 3T란? : mongoDB의 실행환경_   
<br>
_Atlas란? : mongoDB를 deploy하기 위해 이용_

-------------
## Article.findOne()
저장되는 데이터가 다른 스키마의 객체를 포함하는 데이터 객체라면 (ex) name:String, items: [itemSchema]    

delete할 때, findOne 메소드를 써서 하나의 데이터를 찾아 item을 지워야 함

---------------

## How to Setup MongoDB Atlas

1.  https://www.mongodb.com/download-center?jmp=nav (mongoDB Atlas)

2. Add User

3. Make Database

4. cluster의 CONNECT 버튼 클릭 -> connect your application 클릭

5. code example copy하기

6. app.js의 mongoose.connect("(code example)") 수정하기

7. cluster의 collection에 잘 들어갔나 확인하기


