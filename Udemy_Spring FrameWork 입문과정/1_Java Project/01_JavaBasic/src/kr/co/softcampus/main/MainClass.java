package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldEn hello1 = new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldKo hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}
}
