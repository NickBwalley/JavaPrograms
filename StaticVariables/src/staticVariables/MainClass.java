package staticVariables;

public class MainClass {

	public static void main(String[] args) {
		nickFury apples = new nickFury("Enid", "Sanaipei");
		nickFury mangoes = new nickFury("Ivy", "Felicia");
		nickFury pears = new nickFury("Serena", "Nduta");
		nickFury nicky = new nickFury("Nick", "Bwalley");
		System.out.println("Total Members: " + nickFury.totalMembers());
	}

}
