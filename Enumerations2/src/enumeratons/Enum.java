package enumeratons;

public class Enum {

	public static void main(String[] args) {
		for(Mango superstars: Mango.values())
			System.out.printf("%s--%s--%s\n", superstars, superstars.getFinisher(), superstars.getWeight());
	}

}
