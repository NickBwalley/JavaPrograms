package javastrings;

public class Main {

	public static void main(String[] args) {
		// String length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println();
		// more string methods
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt2.toLowerCase());   // Outputs "hello world"
		System.out.println();
		// The indexOf() method returns the index (the position) of the first occurrence of 
		// a specified text in a string (including whitespace):
		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate")); // Outputs 7
		System.out.println();
		// String concatenation Operator
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		// You can also use the concat() method to concatenate two strings:
		String fName = "Nick ";
		String mName = "Biiy ";
		String lName = "Bwalley";
		System.out.println(fName.concat(mName).concat(lName));
		System.out.println();
		// Special Characters
		// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		// The solution to avoid this problem, is to use the backslash escape character.
		// The backslash (\) escape character turns special characters into string characters:
		
//		Escape-character	Result	Description
//		\'					'		Single quote
//		\"					"		Double quote
//		\\					\		Backslash
		// inserting double quotes
		String favoriteMovie = "My favorite movie is \"Just Add Water\"";
		System.out.println(favoriteMovie);
		
		//inserting single quotes
		String txt4 = "It\'s alright.";
		System.out.println(txt4);
		
		//inserting a backslash
		String txt5 = "The character \\ is called a backslash";
		System.out.println(txt5);
		System.out.println();
		new Main().escapeSequence();
	}
	
	// ESCAPE SEQUENCE IN JAVA
//
//		Code	Result	
//		\n		New Line	
//		\r		Carriage Return	
//		\t		Tab	
//		\b		Backspace	
//		\f		Form Feed
	
	// Six other escape sequences are valid in Java:
	public void escapeSequence() {
		String txt = "Hello\nWorld!";
		System.out.println(txt);
		System.out.println();
		String txt2 = "Hello\rWorld!";
		System.out.println(txt2);
		// \n is a line feed (LF) character, character code 10. \r is a carriage return (CR) character, 
		// character code 13. ... On Windows, for instance, lines in text files are terminated 
		// using CR followed immediately by LF (e.g., CRLF). On Unix systems and their derivatives, only LF is used.
		System.out.println();
		String txt3 = "Hello\tWorld!"; // adds tab 
		System.out.println(txt3);
		System.out.println();
		String txt4 = "Hello World!";
		System.out.println(txt4);
	}

}
