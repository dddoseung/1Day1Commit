
public class Person { // �θ� Ŭ����

	String personName;
	String birthDate;
	String homeAddress;
	
	public Person(String n, String date, String address) {
		this.personName=n;
		this.birthDate=date;
		this.homeAddress=address;
	}
	
	public String getName() {
		return personName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	void setName(String name) {
		personName=name;
	}
	
	void setBirthDate(String date) {
		birthDate=date;
	}

}
