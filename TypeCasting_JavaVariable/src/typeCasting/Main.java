package typeCasting;

public class Main {

	public static void main(String[] args) {
		float f = 10.5f;
		//int a = f; //compile time error!..
		int a = (int)f;
		System.out.println(f);
		System.out.println(a);
		

	}

}
