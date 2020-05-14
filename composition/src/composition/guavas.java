package composition;

public class guavas {
	private int day;
	private int month;
	private int year;
	
	public guavas(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		
		System.out.printf("The Date Format is %s\n", this);
	}
	
	public String toString() {
		return String.format("%02d-%02d-%02d", day, month, year);
	}
	
}
