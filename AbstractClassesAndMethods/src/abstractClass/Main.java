package abstractClass;

public class Main {

	public static void main(String[] args) {
		MainBank equity = new Bank_A();
		System.out.println(equity.getInterestRate());
		
	}

}

//An Abstract class is a class which cannot be instantiated
// SuperClass (Base Class, Parent Class)
// SubClass (Derived Class, Child Class)

//PROPERTIES OF AN ABSTRACT CLASS
// Your cannot create an instance of an object of an abstract class but you can create a reference from
// its derived classes (Abstract classes cannot be instantiated)

//PROPERTIES OF AN ABSTRACT METHOD
// For you to declare a method abstract, the entire class needs to be an abstract class.
// You don't need the method body or instantiation.