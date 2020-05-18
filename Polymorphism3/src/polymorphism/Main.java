package polymorphism;

public class Main {

	public static void main(String[] args) {
		//Food fo = new Food();
		Rice ri = new Rice();
		Tuna tu = new Tuna();
		Digest dig = new Digest();
	
		dig.digest(ri);
		dig.digest(tu);
	}

}
/*
 * Abstract Class must be overridden 
 * Abstract Class you cannot create an object out of it
 * When you have a method inside a class the whole class needs to be labeled abstract
 * Abstract class does not have a body
 * Each time you have an abstract class in the super class then the subclasses need to override this abstract class
 * */