package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
	
		TestBean1 test1 = ctx.getBean("t1",TestBean1.class);
		System.out.println(test1);
		
		System.out.println("----------");
		
		TestBean2 test2 = ctx.getBean("t2",TestBean2.class);
		System.out.println(test2);
		ctx.close();
	}

}
