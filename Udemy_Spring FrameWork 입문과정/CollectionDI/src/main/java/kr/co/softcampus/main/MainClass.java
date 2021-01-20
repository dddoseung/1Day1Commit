package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");

		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println(t1.getList1());
		System.out.println(t1.getList2());
		System.out.println(t1.getList3());

		System.out.println("================");

		System.out.println(t1.getSet1());
		System.out.println(t1.getSet2());
		System.out.println(t1.getSet3());
		// Set은 중복된 bean, value 못 들어간다(하나로 취급한다)

		System.out.println("================");

		System.out.println(t1.getMap1());

		System.out.println("================");

		System.out.println(t1.getProp1());
		ctx.close();

	}

}
