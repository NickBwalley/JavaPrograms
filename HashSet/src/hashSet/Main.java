package hashSet;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Nicholas");
		name.add("Lorna");
		name.add("Solomon");
		name.add("David");
		name.add("Brian");
		name.add("Smith");
		
		Iterator<String> itr = name.iterator(); // prints the list in forward direction
		while(itr.hasNext())
			System.out.println(itr.next()); // prints the value in forward direction
		
	}

}
