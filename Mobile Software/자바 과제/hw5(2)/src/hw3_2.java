public class hw3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("ȫ�浿","1990/01/01","������",2400,"00000000");
		Employee emp2=new Employee("�̼���","1967/11/15","������",3600,"00001011");
		Employee emp3=new Employee("�赿��","1988/03/21","���ı�",1200,"00002022");
		Employee emp4=new Employee("��Ȳ","1960/02/28","������",7200,"00003033");
		Employee emp5=new Employee("������","1969/04/02","�߶���",9600,"00004044");
		   // �̸�, ����, �ּ�, "����", ���
		
		Student std1=new Student("��⿵","1994/11/23","�߱�",3.4,"2017112179");
		Student std2=new Student("�̱⿵","1996/03/18","������",4.5,"2015112274");
		Student std3=new Student("��⿵","1997/12/06","���۱�",4.0,"2014112130");
		Student std4=new Student("��⿵","1999/05/05","���ʱ�",3.0,"2012112202");
		Student std5=new Student("���⿵","1998/01/21","������",2.5,"2016112226");
		 //  �̸�, ����, �ּ�, ����, ���
		
		int Emp_mean;
		Emp_mean=(emp1.getMonthlySalary()+emp2.getMonthlySalary()+emp3.getMonthlySalary()+emp4.getMonthlySalary()+emp5.getMonthlySalary())/5;
		  // �� employee�� "����"�� return�Ǿ� ����.
		
		System.out.println("Employee�� ��� ����: "+Emp_mean);
		
		double Std_mean;
		Std_mean=(std1.getGPA()+std2.getGPA()+std3.getGPA()+std4.getGPA()+std5.getGPA())/5;
		 // �� student�� ������ return�Ǿ� ����
		
		System.out.format("Student�� ��� GPA: %.2f",Std_mean);
		 // �Ҽ��� ��°�ڸ����� ���
		
	}

}
