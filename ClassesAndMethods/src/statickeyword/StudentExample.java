package statickeyword;

public class StudentExample {
	String name;
	int age;
	static int noOfStudents; //static variable
	
	StudentExample(){ //constructor
		noOfStudents++;
	}
	public static int getNoOfStudents() {
		return noOfStudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
