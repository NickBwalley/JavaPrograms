package vectors;
import java.util.Vector;
public class Nicky {
	
	public void nickyVectors() {
		Vector nick = new Vector(4);
		System.out.println("Vector Capacity: " + nick.capacity());
		nick.addElement(new String("Manchester United")); // add object which is the element 
		System.out.println(nick);
		nick.add(1, "NickBwalley"); // add item to a specified index
		System.out.println(nick);
		
	}
}
