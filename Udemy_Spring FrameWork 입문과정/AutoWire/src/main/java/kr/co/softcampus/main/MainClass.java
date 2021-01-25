package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean1 obj1 = ctx.getBean("obj1",TestBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		
		System.out.println("--------------");
		
		TestBean1 obj2 = ctx.getBean("obj2",TestBean1.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		
		System.out.println("--------------");
		
		TestBean1 obj3 = ctx.getBean("obj3",TestBean1.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		ctx.close();
	}

}
