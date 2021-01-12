package kr.co.softcampus.beans;

public class TestBean {
	private int data1;
	private double data2;
	private String data3;

	public TestBean() {
		System.out.println("TestBean�� �⺻ ������");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}

	public TestBean(int data1) {
		System.out.println("TestBean�� ������: int ���� �Ѱ�");
		this.data1=data1;
		this.data2=0.0;
		this.data3=null;
	}
	
	public TestBean(double data2) {
		System.out.println("TestBean�� ������: double ���� �Ѱ�");
		this.data1=0;
		this.data2=data2;
		this.data3=null;
	}
	
	public TestBean(String data3) {
		System.out.println("TestBean�� ������: String ���� �Ѱ�");
		this.data1=0;
		this.data2=0.0;
		this.data3=data3;
	}
	
	public TestBean(int data1, double data2, String data3) {
		System.out.println("TestBean�� ������: ���� 3��");
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
	}
	
	public void printData() {
		System.out.printf("data1: %d\n", data1);
		System.out.printf("data2: %f\n", data2);
		System.out.printf("data3: %s\n", data3);
	}
}
