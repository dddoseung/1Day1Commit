package kr.co.softcampus.beans;

public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3 �������Դϴ�");
	}

	public void bean3_init() {
		System.out.println("TestBean3�� init �޼���");
	}

	public void bean3_destroy() {
		System.out.println("TestBean3�� destroy �޼���");
	}

	public void default_init() {
		System.out.println("default init �޼���(TestBean3�� �޼���)");
	}

	public void default_destroy() {
		System.out.println("default destroy �޼���(TestBean3�� �޼���)");
	}
}
