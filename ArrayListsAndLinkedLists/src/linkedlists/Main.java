package linkedlists;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Lorna");
		linkedList.add("Nicky");
		linkedList.add("Solomon");
		linkedList.add("Brian");
		linkedList.addFirst("KingKong"); // adds an elements top of the list
		linkedList.addLast("TheLastRide"); // adds an element last of the list
		linkedList.removeFirst(); // remove the first element of the list
		linkedList.removeLast(); // remove the last element of the list 
		linkedList.add(0, "JokerSmoker");
		linkedList.set(1, "Nicholas");
		
		//enhanced for loop
		for(String x: linkedList)
			System.out.println(x);
		System.out.println("size = " + linkedList.size());
		linkedList.clear(); // clears all the element of the list 

	}

}
