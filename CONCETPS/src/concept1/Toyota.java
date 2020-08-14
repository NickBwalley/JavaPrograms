package concept1;

public class Toyota {
	private int speed;
	//constructor
	public Toyota(int sp) {
		speed = sp;
		System.out.println(this);
	}
	//implementing 'this' keyword
	public String toString() {
		return String.format("%d KM/H", speed);
	}
	

}
