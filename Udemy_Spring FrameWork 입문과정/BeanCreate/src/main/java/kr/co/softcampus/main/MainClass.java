package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ApplicationContext ��Ű�� '����'
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");

		// id�� test1�� bean ��ü�� �ּҰ��� �޾ƿ´�
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.println(t1);

		// id�� test2�� bean ��ü�� �ּҰ��� �޾ƿ´�.
		TestBean t2 = ctx.getBean("test2", TestBean.class);
		System.out.println(t2);

		// id�� test3�� bean ��ü�� �ּҰ��� �޾ƿ´�.
		TestBean t3 = ctx.getBean("test3", TestBean.class);
		System.out.println(t3);

		TestBean t4 = ctx.getBean("test3", TestBean.class);
		System.out.println(t4);

		ctx.close(); // bean��ü�� �Ҹ�ȴ�.
	}

}
