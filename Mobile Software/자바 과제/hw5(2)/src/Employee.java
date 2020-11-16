
public class Employee extends Person {
	
	String employeeID; // 8자리로 구성되어야 함
	int monthlySalary; // 월급?

	public Employee(String name, String date, String address, int salary, String id){
		
		super(name, date, address);
		this.monthlySalary=salary/12; // salary는 연봉, monthlySalary는 월급
		this.employeeID=id;
	}
	
	public int getMonthlySalary() {
		return monthlySalary;
	}

}
