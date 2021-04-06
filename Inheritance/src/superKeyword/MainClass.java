package superKeyword;

public class MainClass {

	public static void main(String[] args) {
		SubClass nick = new SubClass();	//Instantiating the SubClass
		nick.myMethod();
		System.out.println();
		SubClass2 nick2 = new SubClass2(14);
		nick2.getAge();
		
	}
	

}
