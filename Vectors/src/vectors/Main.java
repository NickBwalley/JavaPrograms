package vectors;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		printVector();
	}
	
	//method for creating a vector
	public static void printVector() {
		Vector vector = new Vector(3);
		System.out.println("Initial Capacity of the Vector is: "+vector.capacity());
		vector.addElement(new String("Nick"));
		vector.addElement(new Integer(99));
		vector.addElement(new Float(87.999999994));
		vector.addElement(new Double(96.499));
		vector.addElement(new String("I Love C++"));
		vector.add(1, "Bwalley");//adds an element at a specific index
		vector.add(2, 79);
		System.out.println("-------------------------------------------");
		System.out.println(vector);
		System.out.println("-------------------------------------------");
		System.out.println("Final Capacity of the Vector is: "+vector.capacity());
		System.out.println("This Vector is of size: "+vector.size());		
		System.out.println("The first Element is: "+vector.firstElement());
		System.out.println("The Last Element is: "+vector.lastElement());
	}
}
