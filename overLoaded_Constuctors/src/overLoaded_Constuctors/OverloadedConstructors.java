package overLoaded_Constuctors;

public class OverloadedConstructors {

	public static void main(String[] args) {
		ConstructorOverloading nicky = new ConstructorOverloading();
		ConstructorOverloading rikki = new ConstructorOverloading(12);
		ConstructorOverloading cleo = new ConstructorOverloading(12,19);
		ConstructorOverloading emma = new ConstructorOverloading(12,19,49);
		
		System.out.printf("%s\n", nicky.toMillitary());
		System.out.printf("%s\n", rikki.toMillitary());
		System.out.printf("%s\n", cleo.toMillitary());
		System.out.printf("%s\n", emma.toMillitary());
		
	}		

}
