
public class Student extends Person {
	String studentID;
	double GPA;
	
	public Student(String name, String date, String address, double gpa, String id){
		
		super(name, date, address);
		this.studentID=id;
		this.GPA=gpa;
	}
	
	public double getGPA() {
		return GPA;
	}
}
