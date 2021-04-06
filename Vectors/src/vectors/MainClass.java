package vectors;
import java.util.Vector;
public class MainClass {

	public static void main(String[] args) {
		//printVector();
		
		//creating anonymous object in Java 
		new Nicky().nickyVectors();
		new Nicky().anonymousMethod();
	}
	
	//method for creating a vector
	public static void printVector() {
		Vector vector = new Vector(3);
		System.out.println("Initial Capacity of the Vector is: "+vector.capacity());
		vector.addElement(new String("Nick"));
		vector.addElement(new Integer(99));
		vector.addElement(new Float(87.99994));
		vector.addElement(new Double(96.499));
		vector.addElement(new String("I Love C++"));
		vector.add(1, "Bwalley");//adds an element at index 1
		vector.add(2, 79);//adds an element at index 2 
		System.out.println("-------------------------------------------");
		System.out.println(vector);
		System.out.println("-------------------------------------------");
		System.out.println("Final Capacity of the Vector is: "+vector.capacity());
		System.out.println("This Vector is of size: "+vector.size());		
		System.out.println("The first Element is: "+vector.firstElement());
		System.out.println("The Last Element is: "+vector.lastElement());
		System.out.println("Element at index 1 is: "+vector.indexOf(96.499));
		System.out.println("Element at index 4 is: "+vector.elementAt(4));
		System.out.println("The Element at index 3 is: "+vector.get(3));
		System.out.println(vector.isEmpty());//checks if the vector is empty
		System.out.println(vector.remove(1));//removes the element at the index		
		System.out.println(vector);
		System.out.println(vector.set(1, "BronzeBomber"));//replaces the index at position with the new 
		System.out.println(vector);
	}
}
