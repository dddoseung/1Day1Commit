import java.util.Vector;
import java.util.Enumeration;

public class hw5_2 extends hw3_2{

	public static void main(String[] args) {
		
		/*Vector의 저장요소는 "Person 클래스"*/
		Vector<Person>  v=new Vector<Person> ();
		
		Employee emp1=new Employee("홍길동","1990/01/01","강동구",2400,"00000000");
		Employee emp2=new Employee("이순신","1967/11/15","강남구",3600,"00001011");
		Employee emp3=new Employee("김동국","1988/03/21","송파구",1200,"00002022");
		Employee emp4=new Employee("이황","1960/02/28","강동구",7200,"00003033");
		Employee emp5=new Employee("강감찬","1969/04/02","중랑구",9600,"00004044");
		
		Student std1=new Student("김기영","1994/11/23","중구",3.4,"2017112179");
		Student std2=new Student("이기영","1996/03/18","강서구",4.5,"2015112274");
		Student std3=new Student("삼기영","1997/12/06","동작구",4.0,"2014112130");
		Student std4=new Student("사기영","1999/05/05","서초구",3.0,"2012112202");
		Student std5=new Student("오기영","1998/01/21","성동구",2.5,"2016112226");
		
		v.addElement(emp1); // Person클래스의 자식클래스의 인스턴스라 되는듯
		v.addElement(emp2);
		v.addElement(emp3);
		v.addElement(emp4);
		v.addElement(emp5);

		v.addElement(std1);
		v.addElement(std2);
		v.addElement(std3);
		v.addElement(std4);
		v.addElement(std5);
		
		//방법1

		for(int index=0;index<v.size();index++){
			Person p=v.elementAt(index); 
			// v벡터의 index번째 element를 Person 변수p에 저장한다.
			System.out.println(p.getName());
			// p의 메소드 getName으로 이름을 출력한다.
		}
		
		

		/* 
		Enumeration vEnum=v.elements(); 
		// 타입이 Object이다.
		Object obj=vEnum.nextElement();
		//Object 변수obj에 다음 element를 저장한다.
		
		while(obj!=null) {
			System.out.println(((Person) obj).getName()); 
													// obj의 자료형이 Object라서 Casting 필요!
			obj=vEnum.nextElement();
			//다음 element로 변경해준다.
		}
*/


	}
}
