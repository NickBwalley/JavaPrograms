package concept1;

public class Car {
	private Subaru subaru;
	private Toyota toyota;
	//constructor 
	public Car(Subaru sub, Toyota toy ) {
		subaru = sub;
		toyota = toy;
		
		System.out.printf("Subaru Speed: %s\nToyota Speed: %s", subaru, toyota);
	}

}
