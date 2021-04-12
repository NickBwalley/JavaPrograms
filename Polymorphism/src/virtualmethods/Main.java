package virtualmethods;

public class Main {

	public static void main(String[] args) {
		Salary s = new Salary("Nick", "Bwalley", 33, 4500);
		Employee e = new Salary("Allan", "Smith", 34, 500);
		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}

}
