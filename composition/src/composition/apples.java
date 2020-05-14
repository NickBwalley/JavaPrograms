package composition;

public class apples {
	private String name;
	private guavas birthday;
	
	public apples(String myName, guavas myBirthday) {
		name = myName;
		birthday = myBirthday;
	}
	
	public String toString() {
		return String.format("My name is %s, My Birthday is %s", name, birthday);
	}
}
