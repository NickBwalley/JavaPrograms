package methodOverloading;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(Add(49,99));
		System.out.println(Add(49.33,99.55));
		System.out.println(Add("Nick ", "Bwalley"));

	}
	public static int Add (int a, int b) {
		return (a + b);
	}
	public static double Add (double a, double b) {
		return (a + b);
	}
	public static String Add (String a, String b) {
		return (a + b);
	}

}
/*Method Overloading -> Method with the same name but different return type*/