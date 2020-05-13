package timeClass1;

public class TimeClass1 {

	public static void main(String[] args) {
		TimeToString bronze = new TimeToString();
		bronze.setTime(18, 49, 59);
		System.out.println(bronze.toMillitary());
		bronze.setTime(14, 13, 49);
		System.out.println(bronze.toMillitary());
		System.out.println(bronze.toString());
	}

}
