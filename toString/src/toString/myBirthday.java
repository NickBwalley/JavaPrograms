package toString;

public class myBirthday {
	private int day;
	private int month;
	private int year;
	
	//constructor 
	public myBirthday(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		
		System.out.printf("Your Were Born on %s", this);
	}
	
	//toString method
	public String toString() {
		return String.format("%02d - %02d - %02d", day, month, year);
	}
}
