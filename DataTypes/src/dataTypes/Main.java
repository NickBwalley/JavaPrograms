package dataTypes;

public class Main {

	public static void main(String[] args) {
	// The byte data type can store whole numbers from -128 to 127. This can be used instead 
		//of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
	// The short data type can store whole numbers from -32768 to 32767:
	// The int data type can store whole numbers from -2147483648 to 2147483647. In general, 
		//and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
	// The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
		//This is used when int is not large enough to store the value. Note that you should end the value with an "L":
	// You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
	
	// Use float or double?
	// The precision of a floating point value indicates how many digits the value can have after the decimal point. 
		//The precision of float is only six or seven decimal digits, while double variables have a precision 
		//of about 15 digits. Therefore it is safer to use double for most calculations.
	// A floating point number can also be a scientific number with an "e" to indicate the power of 10:
	// A boolean data type is declared with the boolean keyword and can only take the values true or false
	// The char data type is used to store a single character. 
		//The character must be surrounded by single quotes, like 'A' or 'c':
		// Alternatively, you can use ASCII values to display certain characters:
	// The String data type is used to store a sequence of characters (text). 
		//String values must be surrounded by double quotes:
	// A String in Java is actually a non-primitive data type, because it refers to an object. 
		//The String object has methods that are used to perform certain operations on strings.
		


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
