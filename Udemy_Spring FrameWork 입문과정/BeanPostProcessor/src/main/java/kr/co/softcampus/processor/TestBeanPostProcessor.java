package kr.co.softcampus.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
	
	// init-method 호출 전
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		switch(beanName) {
		case "t1" :
			System.out.println("id가 t1인 bean 객체 생성(before)");
			break;
		case "t2" :
			System.out.println("id가 t2인 bean 객체 생성(before)");
			break;
		}
		
		return bean; // bean 객체의 주소값
	
	}
	
	// init-method 호출 후
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		switch(beanName) {
		case "t1" :
			System.out.println("id가 t1인 bean 객체 생성(After)");
			break;
		case "t2" :
			System.out.println("id가 t2인 bean 객체 생성(After)");
			break;
		}
		return bean; // bean 객체의 주소값
	}
}
