package enumerations;

public class MainClass {

	public static void main(String[] args) {
		for(Wrestlers1 wrestlers: Wrestlers1.values())
			 System.out.printf("%s\t%s\t%s\n", wrestlers, wrestlers.getNames(), wrestlers.getWeights() );
		System.out.println("----------------------------------");
		for(Wrestlers2 bronzeBomber: Wrestlers2.values())
			System.out.printf("%s  %s  %s\n", bronzeBomber, bronzeBomber.getNickName(), bronzeBomber.getWeights());
	}

}
