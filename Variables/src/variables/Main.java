package variables;

public class Main {

	public static void main(String[] args) {
		Variables variables = new Variables();
		variables.method();
		System.out.println(Variables.m);
		variables.addTwoNumbers();
		System.out.println("--------------");
		variables.widening();
		System.out.println("--------------");
		variables.narrowingTypeCasting();
		System.out.println("--------------");
		variables.overflow();
		System.out.println("--------------");
		variables.addingLowerType();
	}
	
//	A variable is a container which holds the value while the Java program is executed. 
//	A variable is assigned with a data type.
//	Variable is a name of memory location. There are three types of variables in java: local, instance and static.
//  LOCAL VARIABLE: Declared inside the body of a method. You can use this variable only within that method 
//	and the other methods in the class aren't even aware that the variable exists.
//  A local variable cannot be defined with "static" keyword.	
// 	INSTANCE VARIABLE: A variable declared inside the class but outside the body of the method, 
//	is called instance variable. It is not declared as static.
//  It is called instance variable because its value is instance specific and is not shared among instances.
//  STATIC VARIABLE: A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. 
//	Memory allocation for static variable happens only once when the class is loaded in the memory.	
}
