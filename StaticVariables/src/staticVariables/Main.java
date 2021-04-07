package staticVariables;

public class Main {

	public static void main(String[] args) {
		NickFury apples = new NickFury("Enid", "Sanaipei");
		NickFury mangoes = new NickFury("Ivy", "Felicia");
		NickFury pears = new NickFury("Serena", "Nduta");
		NickFury nicky = new NickFury("Nick", "Bwalley");
		System.out.println("Total Members: " + NickFury.totalMembers());
	}

}
