package toString;

public class ToString {
	private int day;
	private int month;
	private int year;
	
	public ToString(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		//printing out using the this keyword and toString method
		System.out.printf("The Date Format is %s\n", this);
	}
	public String toString() {
		return String.format("%d-%d-%d", day, month, year);
	}
}
