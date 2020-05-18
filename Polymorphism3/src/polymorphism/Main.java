package polymorphism;

public class Main {

	public static void main(String[] args) {
		Food fo = new Food();
		Rice ri = new Rice();
		Tuna tu = new Tuna();
		Digest dig = new Digest();
		dig.digest(fo);
		dig.digest(ri);
		dig.digest(tu);
	}

}
/*
 * Abstract Class must be overridden 
 * Abstract Class you cannot create an object out of it
 * */