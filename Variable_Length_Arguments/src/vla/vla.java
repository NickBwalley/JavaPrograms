package vla;

public class vla {

	public static void main(String[] args) {
		//invoking this method 
	System.out.println("The Result is: "+ sum(12,12,12,12,12));
	System.out.println("VLA Result: " + variableLengthArgs(22,33,34,34,34,34,5));
	}
	//method definitions
	public static int sum(int...numbers) {
		int total = 0;
		for(int x: numbers)
			total+=x;
		return total;
		
	}
	
	//variable length Arguments
	public static int variableLengthArgs(int...numbers) {
		int total = 0;
		for(int z: numbers) {
			total+=z;
		}
		return total;
	}

}
