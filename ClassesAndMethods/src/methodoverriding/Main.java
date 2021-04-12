package methodoverriding;

public class Main {

	public static void main(String[] args) {
		MainBank myBank = new Bank_A();
		System.out.println(myBank.getInterestRate());

	}

}
/*OVERRIDING RULES
 *Same method Name
 *Same number of Arguments 
 *Same Return DataType */
 