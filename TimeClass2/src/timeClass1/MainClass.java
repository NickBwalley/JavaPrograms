package timeClass1;

public class MainClass {

	public static void main(String[] args) {
		TimeClass myTime = new TimeClass();
		myTime.setMillitaryTime(13, 49, 49);
		System.out.println(myTime.getMillitaryTime());
		System.out.println(myTime.getNormalTime());
	}

}
