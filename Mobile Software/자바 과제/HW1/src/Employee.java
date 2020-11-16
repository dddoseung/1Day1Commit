
class Employee{
	
	String name;
	int monthly_salary;
	int yearly_salary;
	
	public Employee(String name){
		this.name=name;
	}
	
	public void setMonthlySalary(int monthly_salary) {
		this.monthly_salary=monthly_salary;
	}
	
	public int getYearlySalary() {
		this.yearly_salary=monthly_salary*12;
		return yearly_salary;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {

		int totalSalary = 0; 

		Employee [] e = new Employee[3];

		e[0] = new Employee("Tom");
		e[1] = new Employee("Suzie");
		e[2] = new Employee("Amy");

		e[0].setMonthlySalary(300);
		e[1].setMonthlySalary(350);
		e[2].setMonthlySalary(400);

		for(int i = 0; i < 3; i++) {
			totalSalary = totalSalary + e[i].getYearlySalary(); // 월급의 12배 계산
		}

		System.out.println("Yearly Total Salary = " + totalSalary);
	}

}