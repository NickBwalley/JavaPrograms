package vectors;
import java.util.Vector;
public class Nicky {
	
	public void nickyVectors() {
		Vector nick = new Vector(4);
		System.out.println("Initial Vector Capacity: " + nick.capacity());
		nick.addElement(new String("ManchesterUnited")); // add object which is the element 
		System.out.println(nick);
		nick.add("NickBwalley"); //method 1 to addElement inside your vector
		System.out.println(nick);
		nick.addElement(new Integer(499));// method 2 to addElement inside your vector
		System.out.println(nick);
		nick.addElement( "BrayWyatt");
		System.out.println(nick);
		nick.addElement( "BraunStrowman");
		System.out.println(nick);
		nick.addElement( "StoneCold");
		nick.addElement( "Undertaker");
		nick.addElement( "BobbyLashley");
		nick.addElement( "DrewMcIntyre");
		System.out.println(nick);
		System.out.println("Vector Capacity: " + nick.capacity());
		/*
		 * 1. notice that as the vector capacity becomes full it multiplies its capacity by two*/
		System.out.println("VectorSize: " + nick.size());
		System.out.println("FirstElement: " + nick.firstElement());
		System.out.println("LastElement: " + nick.lastElement());
		System.out.println("VectorIndexOf: " + nick.indexOf("BobbyLashley"));
		System.out.println("VectorElementAtIndex3: " + nick.elementAt(3));
		System.out.println("VectorGetAttrib: " + nick.get(4));
		System.out.println(nick.remove(0));
		System.out.println(nick.isEmpty());
		System.out.println(nick.set(0, "Arsenal"));
		System.out.println(nick);
		nick.clear();
		System.out.println(nick);//prints an empty set
		System.out.println(nick.isEmpty()); // Returns true
		
		
	}
}
