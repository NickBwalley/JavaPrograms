package inheritanceconcepts;

public class Mouse {
	public void squeaks() {
		System.out.println("A Mouse Squeaks!...");
	}
	
	//Since JAVA does not support Multiple Inheritance we can use an interface to implement inheritance 
	interface X{	//interfaces must be abstract and does not have a body
		public void Tuna();
	}
	interface Y{	//interfaces must be abstract and does not have a body
		public void Tilapia();
	}
}
