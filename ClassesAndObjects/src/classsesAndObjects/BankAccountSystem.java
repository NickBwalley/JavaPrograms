package classsesAndObjects;
// Java program to illustrate the working of banking systems 
// where we deposit and withdraw money from your bank account
public class BankAccountSystem {
	int accountNumber;
	String name;
	double amount;
	//initialize object
	void insert(int acc_no, String n, double amt) {
		accountNumber = acc_no;
		name = n;
		amount = amt;
	}
	//deposit method
	void deposit(double amt) {
		amount+=amt;
		System.out.println("KSH: " + amt + " Deposited!..");
	}
	
	//withdraw method
	void withdraw(double amt) {
		if(amount < amt) {
			System.out.println("Insufficient Account Balance!..");
		}else {
			amount-=amt;
			System.out.println("KSH: " + amt + " Withdrawn!..");
		}
		
	}
	void checkBalance() {
		System.out.println("Balance is KSH: " + amount);
	}
	void display() {	// display account details
		System.out.println("************************");
		System.out.println("AccountNumber: " + accountNumber + "\n" + "Name: " + name + "\n" + 
		"TotalAmount: " + amount);
		System.out.println("************************");
	}
	
}
