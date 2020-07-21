package abstraction;

public class Salary extends Employee {
	public double salary; //annual salary
	//constructor
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number, salary);
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of salary Class");
		System.out.println("Mailing check to " + getName() + " With Salary " + salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if(newSalary > 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing Salary for " + getName());
		return salary/52;
	}
}
