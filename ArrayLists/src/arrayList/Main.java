package arrayList;
import java.util.ArrayList;
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

}
