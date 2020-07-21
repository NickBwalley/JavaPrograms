package virtualMethods;

public class Employee {
	private String name;
	private String address;
	private int number;
	//constructor
	public Employee(String name, String address, int number) {
		System.out.println("Constructing an Employee..");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a Check to: " + this.name + " " + this.address);
	}
	
	public String toString() {
		return name + " " + address + " " + number;
	}
	
	public String getName() {
		return name;
	}
	
	pu

}
