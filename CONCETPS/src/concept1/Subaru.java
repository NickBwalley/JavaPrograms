package concept1;

public class Subaru {
	private int speed;
	//constructor
	public Subaru(int sp) {
		speed = sp;
		
		System.out.println(this);
	}
	//implementing 'this' keyword
	public String toString() {
		return String.format("%d KM/H", speed);
	}
}
