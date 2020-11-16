
public class Employee extends Person {
	
	String employeeID; // 8�ڸ��� �����Ǿ�� ��
	int monthlySalary; // ����?

	public Employee(String name, String date, String address, int salary, String id){
		
		super(name, date, address);
		this.monthlySalary=salary/12; // salary�� ����, monthlySalary�� ����
		this.employeeID=id;
	}
	
	public int getMonthlySalary() {
		return monthlySalary;
	}

}
