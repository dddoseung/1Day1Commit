package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ApplicationContext ÆÐÅ°Áö ³»ºÎ
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");

		// init-method(o) default-method(x)
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println(t1);

		// init-method(x) default-method(x)
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println(t2);

		// init-method(o) default-method(o)
		TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
		System.out.println(t3);

		// init-method(x) default-method(o)
		TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
		System.out.println(t4);

		ctx.close(); // °´Ã¼ ¼Ò¸êµÊ

	}

}
