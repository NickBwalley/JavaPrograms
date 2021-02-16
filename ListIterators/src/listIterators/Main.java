package listIterators;
/*
 * public boolean hasNext()
 * public Object next()
 * public boolean hasPrevious()
 * public object previous()
 * */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Nicholas");
		names.add("Lorna");
		names.add("Solomon");
		names.add("Brian");
		names.add("David");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--------------------");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
	}

}
