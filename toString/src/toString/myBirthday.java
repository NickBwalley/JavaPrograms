package toString;

public class myBirthday {
	private int day;
	private int month;
	private int year;
	
	//constructor 
	public myBirthday(int d, int m, int y) {
		d = day;
		m = month;
		y = year;
		System.out.printf("Your Were Born on %s", this);
	}
	
	//toString method
	public String toString() {
		return String.format("%d - %d - %d", day, month, year);
	}
}
