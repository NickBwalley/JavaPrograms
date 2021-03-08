package javaBasics;

public class MethodsAndArgs {

	public static void main(String[] args) {
		sayHello("Nick");
		sayHello("Lorna");
		addNumbers(48,38);
		
		int average = averageNumbers(10,10,10);
		System.out.println(average);
		
	}
	public static void sayHello(String name) {
		System.out.println("Hello "+ name);
	}
	public static void addNumbers (int a, int b) {
		System.out.println(a+b);
	}
	public static int averageNumbers ( int a, int b, int c) {
		return ((a + b + c)/3);
	}

}
