package kr.co.softcampus.beans;

public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3 생성자입니다");
	}

	public void bean3_init() {
		System.out.println("TestBean3의 init 메서드");
	}

	public void bean3_destroy() {
		System.out.println("TestBean3의 destroy 메서드");
	}

	public void default_init() {
		System.out.println("default init 메서드(TestBean3의 메서드)");
	}

	public void default_destroy() {
		System.out.println("default destroy 메서드(TestBean3의 메서드)");
	}
}
