package kr.co.softcampus.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		
		// beans.xml ������ �ε��Ѵ�. (beans ���� ���)
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// xml�� ������ bean ��ü�� �ּҰ��� �����´�.
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello_id");
		callMethod(hello1);
		
		HelloWorld hello2=ctx.getBean("hello_id", HelloWorld.class);
		callMethod(hello2);
		
		ctx.close();
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
