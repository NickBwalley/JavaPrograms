package methodOverloading;

public class MainClass {

		// Instead of defining two methods that should do the same thing, it is better to overload one.

		// In the example below, we overload the plusMethod method to work for both int and double:

		// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
	
		static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}

		public static void main(String[] args) {
		  int myNum1 = plusMethod(8, 5); // invokes the int method
		  double myNum2 = plusMethod(8.5, 5.5); // invokes the double method
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		}

}
