package exceptionHandling;
//exception: is an event, which occurs during the execution of a program, that disrupts the normal flow of the 
// programs instruction
public class MainClass {

	public static void main(String[] args) {
		int [] b = new int[2];
		try {
			//int a = 100/0;
			System.out.println(b[4]);
		}catch(ArithmeticException e) { 	// ArithmeticException
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e) {	//general Exception => has more priority so it should come last
			System.out.println(e);
		}
		System.out.println("WellDone!");

	}

}
