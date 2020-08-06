package vla;

public class vla {

	public static void main(String[] args) {
		//invoking this method 
	System.out.println("The Result is: "+ sum(12,12,12,12,12));
	System.out.println("The Multiplication Answer: " + multiplication(33,33));
	}
	//method definitions
	public static int sum(int...numbers) {
		int total = 0;
		for(int x: numbers)
			total+=x;
		return total;
		
	}
	
	//method for multiplication
		public static int multiplication(int...numbers) {
			int result = 1;
			for(int z: numbers)
				result*=z;		
			return result;
		}

}
