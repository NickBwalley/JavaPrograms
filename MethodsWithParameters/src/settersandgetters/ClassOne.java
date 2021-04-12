package settersandgetters;

public class ClassOne {
	private String name;
	private int age;
	
	public void setName(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void getDetails() {
		System.out.printf("Your name is %s \tYou are %d Years Old!", getName(), getAge());
	}
}
