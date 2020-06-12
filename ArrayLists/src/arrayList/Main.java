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
		
	}

}
