package setterAndGetter;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner rikki = new Scanner(System.in);
		String name;
		System.out.println("Enter your Ex-Girlfriend's name: ");
		name = rikki.nextLine();
		nicky cleo = new nicky();
		cleo.setName(name);
		cleo.saying();
	}

}
