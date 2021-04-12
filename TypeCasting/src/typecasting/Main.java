package typecasting;
// Type casting is when you assign a value of one primitive data type to another type.
// In Java, there are two types of casting:

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte
public class Main {

	public static void main(String[] args) {
		//wideningCasting();
		new Main().narrowingCasting();
	}
	
	// Widening casting is done automatically when passing a smaller size type to a larger size type:
	public static void wideningCasting() {
	    int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	}
	
	// Narrowing casting must be done manually by placing the type in parentheses before the value:
	public void narrowingCasting() {
	    double myDouble = 9.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	}
	
}
//DataType	Size	Description
//byte		1 byte	Stores whole numbers from -128 to 127
//short		2 bytes	Stores whole numbers from -32,768 to 32,767
//int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long		8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float		4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//boolean	1 bit	Stores true or false values
//char		2 bytes	Stores a single character/letter or ASCII values

//Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
//Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

