package timeClass;

public class MainClass {

	public static void main(String[] args) {
		TimeClass nicky = new TimeClass();
		System.out.println(nicky.toMillitary());
		nicky.setTime(12,14,14);
		System.out.println(nicky.toMillitary());
	}

}
