package variables;

public class Variables {

	int data=50;//instance variable  
	static int m=100;//static variable
	
	void method(){  
	int n=90;//local variable  
	System.out.println(n);
	}
	
	public void addTwoNumbers() {
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	
	public void widening() {
		int a = 10;
		float f = a;
		System.out.println(a);
		System.out.println(f);
	}
	
	public void narrowingTypeCasting() {
		float f = 10.5f;
		//int a=f;//Compile time error
		int a = (int)f;
		System.out.println(f);
		System.out.println(a);
		
	}
	
	public void overflow() {
		//overflow
		int a = 130;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void addingLowerType() {
		byte a = 10;
		byte b = 10;
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int 
		byte c = (byte)(a+b);
		System.out.println(c);
		
	}
}
