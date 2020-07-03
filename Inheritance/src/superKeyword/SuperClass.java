package superKeyword;

public class SuperClass {
	int age;
	
	SuperClass(int age){
		this.age = age;
	}
	
	public void getAge() {
		System.out.println("Variable Value Age in SuperClass is: "+age);
	}
	int num = 20;
	
	public void display() {
		System.out.println("This is the Display Method of the SuperClass!...");
	}
}
