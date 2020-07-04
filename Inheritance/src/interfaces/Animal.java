package interfaces;

public class Animal implements Dog, Cat {
	
	public void barks() {
		System.out.println("A Dog Barks!..");
	}
	
	public void Meow() {
		System.out.println("A Cat Meows!..");
	}

}
