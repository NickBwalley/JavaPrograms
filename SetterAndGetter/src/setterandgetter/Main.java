package setterandgetter;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("Enter your Ex-Girlfriend's name: ");
		name = input.nextLine();
		Nicky cleo = new Nicky();
		cleo.setName(name);
		cleo.saying();
		input.close();
	}

}
