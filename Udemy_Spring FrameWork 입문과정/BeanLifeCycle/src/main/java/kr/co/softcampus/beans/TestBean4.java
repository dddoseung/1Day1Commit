package kr.co.softcampus.beans;

public class TestBean4 {
	public TestBean4() {
		System.out.println("TestBean4 생성자입니다");
	}

	public void default_init() {
		System.out.println("default init 메서드(TestBean4의 메서드)");
	}

	public void default_destroy() {
		System.out.println("default destroy 메서드(TestBean4의 메서드)");
	}
}
