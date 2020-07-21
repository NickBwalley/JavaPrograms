package abstraction;

public abstract class Employee {

	private String name;
	private String address;
	private int number;
	//constructor
	public Employee(String name, String address, int number, double salary) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay() {
		System.out.println("Inside Employee ComputePay");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	
	public String toString() {
		return name + " " + address + " " + number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		newAddress = address;
	}
	
	public int getNumber() {
		return number;
	}
	
	
	
}
