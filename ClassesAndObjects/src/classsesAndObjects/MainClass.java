package classsesAndObjects;

public class MainClass {
	
	
	public static void main(String[] args) {
		// 1. Through reference
		ByReference r = new ByReference();
		ByReference n = new ByReference();
		
		r.id = 122790;
		r.name = "Nicholas";
		n.id = 122994;
		n.name = "Lorna";
		
		System.out.println(r.id + " " + r.name);
		System.out.println(n.id + " " + n.name);
		System.out.println("-----------------------");
		// 2. initialization through method
		ByMethod m1 = new ByMethod();
		ByMethod m2 = new ByMethod();
		m1.studentDetails(122790, "Nicholas");
		m2.studentDetails(122994, "Lorna");
		m1.displayInformation();
		m2.displayInformation();
		System.out.println("-----------------------");
		// 3. Initialization through a constructor
		ByConstructor c1 = new ByConstructor(122790, "Nicholas");
		ByConstructor c2 = new ByConstructor(122994, "Lorna");
		c1.studentDetails();
		c2.studentDetails();
		System.out.println("-----------------------");
		new AnonymousObject().factorial(5); 	// calling method within anonymous object...
		System.out.println("-----------------------");
		System.out.println("BANK ACCOUNT SYSTEM");
		System.out.println("-----------------------");
		BankAccountSystem myAccount = new BankAccountSystem();
		myAccount.insert(122790, "Nicholas", 89000); //creating an account and adding cash
		myAccount.display();
		myAccount.checkBalance();
		myAccount.deposit(14000.89);
		myAccount.checkBalance();
		myAccount.withdraw(49000);
		myAccount.checkBalance();
		
		
		
		
	}
/*	DIFFERENT WAYS TO INITIALIZE OBJECTS
 * 1.By Reference Variable
 * 2.By Method
 * 3.By constructor
 *  
 * */
}
