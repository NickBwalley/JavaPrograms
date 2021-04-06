package composition2;

public class StudentBirthday {
	private int day;
	private int month;
	private int year;
	//constructor
	public StudentBirthday(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		
		System.out.printf("Birthday: %s\n", this);
	}
	
	//implements this keyword
	public String toString() {
		return String.format("%d-%d-%d", day, month, year);
	}

}
