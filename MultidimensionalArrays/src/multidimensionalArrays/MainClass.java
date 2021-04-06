package multidimensionalArrays;

public class MainClass {

	public static void main(String[] args) {
		int firstArr[][] = {{19, 29, 39}, {49, 59, 69}, {79, 89, 99}};
		int secondArr[][] = {{17, 27, 37}, {47, 57, 67}, {77, 87, 97}};
		
		//invoking the method to call print out the array list
		//System.out.println("The first Array carries: ");
		//displayArray(firstArr);
		//System.out.println("The Second Array carries: ");
		//displayArray(secondArr);
		
		System.out.println("Multidimensional Array: ");
		//notice that whenever you make a method static you don't have to create an object to access that method
		MdArray.printArray(firstArr); 
		
		
		
		
	}	
	//method to print the array in the list
	public static void displayArray(int x[][]) {
		for(int row=0; row < x.length; row++) {
			for(int column=0; column < x[row].length; column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
	
}
