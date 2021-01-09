package kr.co.softcampus.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}
	
	//BeanFactory 패키지 '내부' 사용
	public static void test1() {
		ClassPathResource res=new ClassPathResource("kr/co/softcampus/config/beans.xml");
		
		//IOC Container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t1",TestBean.class);
		System.out.printf("t1: %s\n", t1);
		
		TestBean t2 = factory.getBean("t1",TestBean.class);
		System.out.printf("t2: %s\n",t2);
	}
	
	//BeamFactory 패키지 '외부' 사용
	public static void test2() {
		FileSystemResource res=new FileSystemResource("beans.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t3 = factory.getBean("t2", TestBean.class);
		System.out.printf("t3: %s\n",t3);
		
		TestBean t4 = factory.getBean("t2", TestBean.class);
		System.out.printf("t4: %s\n",t4);
	}
	
	//ApplicationContext 패키지 '내부'
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1: %s\n",t1);
		
		TestBean t2 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t2: %s\n",t2);
		
		ctx.close(); // bean객체가 소멸됨
	}
	
	//ApplicationContext 패키지 '외부'
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		TestBean t3 = ctx.getBean("t2",TestBean.class);
		System.out.printf("t3: %s\n",t3);
		
		TestBean t4 = ctx.getBean("t2",TestBean.class);
		System.out.printf("t3: %s\n",t4);
		
		ctx.close();
	}
}
