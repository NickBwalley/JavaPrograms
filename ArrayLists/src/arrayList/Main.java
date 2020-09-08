package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mercedes"); 
		cars.add("BMW");
		cars.add("Subaru");
		cars.add("Porche Cayenne");
		System.out.println(cars);
		System.out.println(cars.get(1));//used to print out a value at a specific index
		cars.set(2, "Jeep");//used to replace the value at that index to the new value defined
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);//used to remove an element from the list
		cars.clear();//clears all the elements inside the ArrayList
		System.out.println(cars);
		System.out.println(cars.size());//prints out the size of the Array 
		System.out.println("---------------------------------------------");
		arrayList();
		System.out.println("\n---------------------------------------------");
		sortingArrayLists();
		
		
		
	}
	
	public static void arrayList() {
		ArrayList<Integer> myNumber = new ArrayList<Integer>();
		myNumber.add(79);
		myNumber.add(49);
		myNumber.add(87);
		myNumber.add(44);
		myNumber.add(99);
		System.out.println(myNumber);
		myNumber.set(4, 109);
		myNumber.remove(0);
		System.out.println(myNumber);
		System.out.println(myNumber.contains(49));//returns boolean value 
		System.out.println(myNumber.indexOf(44));//index of
		//creating a for-each Loop
		for(int i : myNumber) {
			System.out.printf("%d, ", i);
		}
	}
	
	public static void sortingArrayLists() {
		ArrayList<String> girlFriend = new ArrayList<String>();
		girlFriend.add("Janice");
		girlFriend.add("Chelsea");
		girlFriend.add("Amina");
		girlFriend.add("Daisy");
		girlFriend.add("Cynthia");
		girlFriend.add("Zahra");
		girlFriend.add("Catherine");
		girlFriend.add("Lisa");
		girlFriend.add("Amanda");
		//printing out
		System.out.println(girlFriend);
		girlFriend.set(2, "Karen");//replace the element at index 2
		girlFriend.remove(0);
		System.out.println(girlFriend);
		System.out.println(girlFriend.get(4));
		System.out.println(girlFriend.size());
		Collections.sort(girlFriend);
		//printing elements in ascending order
		for(String i: girlFriend)
			System.out.println(i);
		
		
	}

}
