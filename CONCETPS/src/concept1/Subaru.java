package concept1;

public class Subaru {
	private int speed = 250;
	//constructor
	public Subaru() {
		int sp;
		sp = speed;
		
		System.out.println(this);
	}
	//implementing 'this' keyword
	public String toString() {
		return String.format("Subaru: %d KM/H", speed);
	}
}
