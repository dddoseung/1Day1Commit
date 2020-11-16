public class hw3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("홍길동","1990/01/01","강동구",2400,"00000000");
		Employee emp2=new Employee("이순신","1967/11/15","강남구",3600,"00001011");
		Employee emp3=new Employee("김동국","1988/03/21","송파구",1200,"00002022");
		Employee emp4=new Employee("이황","1960/02/28","강동구",7200,"00003033");
		Employee emp5=new Employee("강감찬","1969/04/02","중랑구",9600,"00004044");
		   // 이름, 생일, 주소, "연봉", 사번
		
		Student std1=new Student("김기영","1994/11/23","중구",3.4,"2017112179");
		Student std2=new Student("이기영","1996/03/18","강서구",4.5,"2015112274");
		Student std3=new Student("삼기영","1997/12/06","동작구",4.0,"2014112130");
		Student std4=new Student("사기영","1999/05/05","서초구",3.0,"2012112202");
		Student std5=new Student("오기영","1998/01/21","성동구",2.5,"2016112226");
		 //  이름, 생일, 주소, 학점, 사번
		
		int Emp_mean;
		Emp_mean=(emp1.getMonthlySalary()+emp2.getMonthlySalary()+emp3.getMonthlySalary()+emp4.getMonthlySalary()+emp5.getMonthlySalary())/5;
		  // 각 employee의 "월급"이 return되어 계산됨.
		
		System.out.println("Employee의 평균 월급: "+Emp_mean);
		
		double Std_mean;
		Std_mean=(std1.getGPA()+std2.getGPA()+std3.getGPA()+std4.getGPA()+std5.getGPA())/5;
		 // 각 student의 학점이 return되어 계산됨
		
		System.out.format("Student의 평균 GPA: %.2f",Std_mean);
		 // 소수점 둘째자리까지 출력
		
	}

}
