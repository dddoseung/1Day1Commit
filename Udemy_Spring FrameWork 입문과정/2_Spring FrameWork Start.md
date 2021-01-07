## Spring Framework 소개

__프레임워크란?:__ 개발자들끼리 개발 스타일이 다르지 않도록 하기 위해, 누구나 같은 개발방식을 쓰도록 정한 것

__Spring 프레임워크:__ _Java_ 기반 응용 프로그램 개발 프레임워크

__Spring 프레임워크 특징:__

+ 자바 객체를 직접 관리

- 자바 코드를 줄일 수 있음(중복되는 코드, 반복되는 작업 해소)

* 다수의 개발자와 동시 프로젝트하기 용이

+ 처음 프로젝트 세팅이 복잡함

- 개념을 제대로 숙지하지 않으면 코드 분석도 어려움

Spring 프레임워크 시작: eclipse, jdk 설치 및 환경변수 세팅

----------------------------

## Spring Framework vs Java Project
<br>
[1]
자바 프로젝트에서 클래스가 변경되면,

__객체 생성 부분__ 과 __참조 변수 선언 부분__ 모두 수정해야 함 ->유지보수가 어려움

->HelloWorldKo hello1 (참조 변수 선언 부분) = new HelloWorldKo() (객체 생성 부분);

<br>
[2] Interface를 이용하여 다형성을 활용한다면 (오버라이딩 한다면)

__객체 생성 부분__ 만 수정하면 됨

-> HelloWorld hello1 = new HelloWorldKo();

<br>
[3] Spring FrameWork로 작성한다면 

__모두 수정하지 않아도 됨__ (beans.xml에서 한 줄만 수정하면 됨) ->유지보수가 매우 용이   

```
-> 
[beans.xml]
<bean id="hello_id" class="kr.co.softcampus.beans.HelloWorldKo" />

[Main.java]
HelloWorld hello1=(HelloWorld)ctx.getBean("hello_id");
   // or
HelloWorld hello1=ctx.getBean("hello_id",HelloWorld.class);
```

-------------

## Spring Framework 사용하기
__Maven:__ 자바 프로젝트의 빌드를 자동으로 해주는 도구

개발자가 xml에 작성한 정보를 토대로 컴파일하고 라이브러리를 연결함(한번 작성하고 계속 사용)

Maven서버를 통해 라이브러리를 다운받아 설정하기도 함
