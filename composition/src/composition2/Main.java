package composition2;

public class Main {

	public static void main(String[] args) {
		StudentBirthday nicky = new StudentBirthday(26, 8, 2000);
		StudentDetails nicky2 = new StudentDetails("NickBwalley", nicky);
	}

}
