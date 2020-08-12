package composition2;

public class StudentDetails {
	private String name;
	private StudentBirthday birthday;
	//constructor
	public StudentDetails(String stdName, StudentBirthday stdBirthday) {
		name = stdName;
		birthday = stdBirthday;
		
		System.out.print(this);
	}
	
	//implements this
	public String toString() {
		return String.format("Name: %s\n", name, birthday);
	}
}
