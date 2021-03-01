package timeClass2;

public class TimeClass2 {

	public static void main(String[] args) {
		TimeClass bronze = new TimeClass();
		bronze.setTime(12, 14, 49);
		System.out.println(bronze.toMillitary());
		bronze.setTime(14, 49, 59);
		System.out.println(bronze.timeToString());
	}

}
