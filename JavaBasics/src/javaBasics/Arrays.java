package javaBasics;

public class Arrays {

	public static void main(String[] args) {
		int [] myArray = {1,2,3,4,5}; // array initializer 
	
		  int [] myArray2 = new int[3];
		  int [] myArray3 = {1,2,3,4,5};
		  int [] myArray4 = new int[] {1,2,3,4,5};
		  
		  for(int i = 0; i < myArray4.length; i++) {
			  System.out.println(myArray4[i]);
		  }
		  System.out.println("---------");
		  int index = 0;
		  while(index < myArray3.length) {
			  System.out.println(myArray3[index]);
			  index++;
		  }
		  System.out.println("------------");
		  int index2 = 0;
		  do {
			  System.out.println(myArray4[index2]);
			  index2++;
			  
		  }while(index2 < 5);

	}

}
