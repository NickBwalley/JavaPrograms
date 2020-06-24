package enum2;

public class Main {

	public static void main(String[] args) {
		//creating an enhanced for loop to print out the values 
		for(EnumJava nick: EnumJava.values())
			System.out.printf("%s, %s, %s\n", nick, nick.getCareer(), nick.getDetails());
	}

}
