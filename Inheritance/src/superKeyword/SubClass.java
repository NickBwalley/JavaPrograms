package superKeyword;

public class SubClass extends SuperClass{
	
	SubClass(int age){
		super(age);
	}
	
	
	int num = 90;
	
	public void display() {
		System.out.println("This is the Display Method of the SubClass!...");
	}
	
//	public void myMethod() {
//		SubClass nicky = new SubClass();	//Instantiating the SubClass()
//		nicky.display();	//invoking the display() method in the SubClass
//		super.display();	//invoking the display() method in the SuperClass
//		
//		System.out.println("The value of the variable named num in the Super Class is: " + super.num);
//		System.out.println("The value of the variable named num in the SubClass is: " + nicky.num);
//		
//	}

}
