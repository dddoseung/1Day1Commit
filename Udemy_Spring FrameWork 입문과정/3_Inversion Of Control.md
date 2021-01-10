## IoC 컨테이너

### IOC(Inversion Of Control) : 제어 역전

+ __프로그램이 흘러가는 흐름__ 이나 __생성되는 객체__ 에 대한 __제어권__ 을 개발자가 갖는 것이 아닌, __프레임워크가 갖는 것__

- 개발자는 프레임워크가 사용하는 파일에 작성하면 이를 토대로 프레임워크가 객체를 생성하여 반환하고 코드 동작순서를 결정하게 됨

### POJO(Plain Old Java Project) :

+ 자바 모델이나 기능, 프레임워크를 따르지 않고 __홀로 독립적이며 단순한 기능을 갖는 객체__ 들을 의미함

- 자바에서는 이러한 객체들을 __Bean__ 이라고 부름


### [IOC 컨테이너의 종류]

-> __BeanFactory(old Version)__ // _xml 로딩 시 자동으로 객체 생성 X_


클래스를 통해 객체를 생성하고 이를 전달한다.

상속 등 객체 간의 관계를 형성하고 이를 관리한다.



-> __ApplicationContext(new Version)__ // _xml 로딩 시 자동으로 객체 생성 O_ (lazy-init으로 조절 가능)

클래스를 통해 객체를 생성하고 이를 전달한다.

상속 등 객체 간의 관계를 형성하고 이를 관리한다.

국제화 지원 등 문자열에 관련된 다양한 기능을 제공한다.

리스너로 등록되어 있는 Bean에 이벤트를 발생시킨다.


---------------
## Bean 객체 생성하기

### bean 태그의 기본 속성



-> __lazy-init:__ xml을 로딩할 때 __자동 객체 생성 여부__ 를 설정한다.

   lazy-init="true" 이면 자동으로 객체가 생성되지 않는다.

   lazy-init="false"이면 자동으로 객체가 생성된다.(기본값)
   

-> __scope:__ __객체의 범위를 설정__ 한다.

   singleton: 객체를 하나만 생성하고, 그 이후에는 생성하지 않는다.(+lazy-init: false)

   prototype: 객체를 가져올 때 마다 각기 다른 객체를 생성한다.(+lazy-init: true)

--------------

## Bean 객체의 생명주기

### 객체 생성 및 소멸 시 호출될 메서드 등록



+ __init-method:__ 생성자 호출 이후 자동으로 호출된다.

- __destroy-method:__ 생성자 소멸(IoC 컨테이너 close) 이후 자동으로 호출된다.

* __default-init-method:__ __init-method를 설정하지 않은 경우 & default method를 선언한 경우__ 자동으로 호출된다.

+ __default-destroy-method:__ __destroy-method를 설정하지 않은 경우 & default method를 선언한 경우__ 자동으로 호출된다.

-----------------

## BeanPostProcessor

BeanPostProcessor: init-method가 호출될 때 __이를 가로채__ 다른 메서드를 호출할 수 있도록 함


(다른 패키지에 클래스에 코드 작성됨)

* __postProcessBeforeInitialization:__ init-method가 호출되기 __전에__ 호출된다.

+ __postProcessAfterInitialization:__ init-method가 호출된 __후에__ 호출된다.

( // init-method가 지정되어 있지 않더라도 호출된다.)
