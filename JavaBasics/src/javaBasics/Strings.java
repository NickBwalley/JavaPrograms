package javaBasics;

public class Strings {

	public static void main(String[] args) {
		String myString = "Hello "+ "World";
		int myStringLength = myString.length();
		String myStringToLowercase = myString.toLowerCase();
		String myStringToUppercase = myString.toUpperCase();
		String myStringReplace = myString.replace('e', 'a');
		
		System.out.println(myString);
		System.out.println(myStringLength);
		System.out.println(myStringToLowercase);
		System.out.println(myString);
		System.out.println(myStringToUppercase);
		System.out.println(myStringReplace);
	}

}
