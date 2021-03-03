package composition;

public class Main {

	public static void main(String[] args) {
		guavas guavasObject = new guavas(12,7,2020);
		apples applesObject = new apples("NickBwalley", guavasObject);
		System.out.println(applesObject);
	}

}
