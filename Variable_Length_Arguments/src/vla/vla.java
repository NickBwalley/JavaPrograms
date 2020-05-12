package vla;

public class vla {

	public static void main(String[] args) {
		//invoking this method 
	System.out.println("The Result is: "+ sum(12,12,12,12,12));
	}
	//method definitions
	public static int sum(int...numbers) {
		int total = 0;
		for(int x: numbers)
			total+=x;
		return total;
		
	}

}
