package javainterfaces;

public class Main {

	public static void main(String[] args) {
		MainBank equity = new BankB();
		BankA kcb = new BankB();
		System.out.println(equity.getInterestRate());
		System.out.println(equity.getIncomeTax());
		System.out.println(kcb.getGrossTax());
	}

}
// Java Interfaces cannot be instantiated (Abstract by nature) 
// Once you declare a class interface, all methods inside it are abstract by nature.
//NOTE:
// Class >> Class >> "extends"
// Interface >> Class >> "implements"
// Interface >> Interface >> 	"extends"
