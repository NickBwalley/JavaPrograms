package tostring;

public class myBirthday {
	private int day;
	private int month;
	private int year;
	//constructor
	public myBirthday(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		
		System.out.printf("%s\n", this);
	}
	// Implementing the <this> keyword inside the constructor
	public String toString() {
		return String.format("My Birthday is\t%d-%d-%d", day, month, year);
	}
}
