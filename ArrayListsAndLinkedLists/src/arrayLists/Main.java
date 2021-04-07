package arrayLists;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(40);
		myList.add(33);
		myList.add(74);
		myList.add(41);
		myList.add(39);
		//enhanced for Loop
		for(Integer x: myList) {
			System.out.println(x);
		} 
		System.out.println("------------------");
		System.out.println("Size = " + myList.size());
		myList.remove(3); // remove an element at a specified index in the array
		myList.set(0, 100);
		for(Integer x: myList) {
			System.out.println(x);
		} 
		System.out.println("------------------");
		System.out.println("Size = " + myList.size()); // size of the elements of the array 
		myList.clear(); // clears all the elements of the array
		System.out.println("Size = " + myList.size()); // size of the elements of the array
		
		
		
		
	}

}
