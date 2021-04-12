package javainterfaces;

public class BankB implements BankA {
	public int getInterestRate() {
		return 5;
	}
	public int getIncomeTax() {
		return 7;
	}
	public int getGrossTax() {
		return 10;
	}
}
