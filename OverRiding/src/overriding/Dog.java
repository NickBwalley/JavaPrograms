package overriding;
// derived class
public class Dog extends Animal {
	public void move() {
		super.move();
		super.barks();
		System.out.println("A Dog Walks and Runs!..");
	}
	
	public void barks() {
		System.out.println("A Dog barks");
	}

}
