package enumeratons;

import java.util.EnumSet;
public class Enum {

	public static void main(String[] args) {
		for(Mango superstars: Mango.values())
			System.out.printf("%s--%s--%s\n", superstars, superstars.getFinisher(), superstars.getWeight());
		System.out.println("\n------------------------------------------");
		System.out.println("\nPrinting Constants using the Range Values\n");
		for(Mango theGreatest: EnumSet.range(Mango.AleisterBlack, Mango.JohnCena))
			System.out.printf("%s--%s--%s\n", theGreatest, theGreatest.getFinisher(), theGreatest.getWeight());
			
	}

}
