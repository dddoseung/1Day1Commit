import java.util.Vector;
import java.util.Enumeration;

public class hw5_2 extends hw3_2{

	public static void main(String[] args) {
		
		/*Vector�� �����Ҵ� "Person Ŭ����"*/
		Vector<Person>  v=new Vector<Person> ();
		
		Employee emp1=new Employee("ȫ�浿","1990/01/01","������",2400,"00000000");
		Employee emp2=new Employee("�̼���","1967/11/15","������",3600,"00001011");
		Employee emp3=new Employee("�赿��","1988/03/21","���ı�",1200,"00002022");
		Employee emp4=new Employee("��Ȳ","1960/02/28","������",7200,"00003033");
		Employee emp5=new Employee("������","1969/04/02","�߶���",9600,"00004044");
		
		Student std1=new Student("��⿵","1994/11/23","�߱�",3.4,"2017112179");
		Student std2=new Student("�̱⿵","1996/03/18","������",4.5,"2015112274");
		Student std3=new Student("��⿵","1997/12/06","���۱�",4.0,"2014112130");
		Student std4=new Student("��⿵","1999/05/05","���ʱ�",3.0,"2012112202");
		Student std5=new Student("���⿵","1998/01/21","������",2.5,"2016112226");
		
		v.addElement(emp1); // PersonŬ������ �ڽ�Ŭ������ �ν��Ͻ��� �Ǵµ�
		v.addElement(emp2);
		v.addElement(emp3);
		v.addElement(emp4);
		v.addElement(emp5);

		v.addElement(std1);
		v.addElement(std2);
		v.addElement(std3);
		v.addElement(std4);
		v.addElement(std5);
		
		//���1

		for(int index=0;index<v.size();index++){
			Person p=v.elementAt(index); 
			// v������ index��° element�� Person ����p�� �����Ѵ�.
			System.out.println(p.getName());
			// p�� �޼ҵ� getName���� �̸��� ����Ѵ�.
		}
		
		

		/* 
		Enumeration vEnum=v.elements(); 
		// Ÿ���� Object�̴�.
		Object obj=vEnum.nextElement();
		//Object ����obj�� ���� element�� �����Ѵ�.
		
		while(obj!=null) {
			System.out.println(((Person) obj).getName()); 
													// obj�� �ڷ����� Object�� Casting �ʿ�!
			obj=vEnum.nextElement();
			//���� element�� �������ش�.
		}
*/


	}
}
