package kr.co.softcampus.main;
import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello=new HelloWorldEn();
		callMethod(hello);
		
		HelloWorld hello2=new HelloWorldEn();
		callMethod(hello2);
		
		HelloWorld hello3=new HelloWorldKo();
		callMethod(hello3);
	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
