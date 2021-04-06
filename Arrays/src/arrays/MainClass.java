package arrays;

public class MainClass {

	public static void main(String[] args) {
		int nicky[] = new int[5]; // Array Creation but not initialized 
		nicky[0] = 10;
		nicky[1] = 20;
		nicky[2] = 30;
		nicky[3] = 40;
		nicky[4] = 50;
		
		// print out one element at an index in an array
		System.out.println(nicky[0] + "\n");
		// printing out all the elements of the nicky[] array
		for(int i : nicky) {
			System.out.println(i);
		}
		
		System.out.println();
		//second way of how to initialize and print arrays 
		
		int rikki[] = {46,30,21,41,39}; // Array initializer 
		System.out.println(rikki[2]);
		System.out.println(rikki.length); // printing out the number of values inside the rikki[] array	
		
		
		
	}

}
