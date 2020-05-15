package staticVariables2;

public class StaticMembers {

	public static void main(String[] args) {
		NickFury apples = new NickFury("Chelsea", "Green");
		NickFury mango = new NickFury("Adam", "Cole");
		NickFury pears = new NickFury("Johnny", "Gargano");
		NickFury lemons = new NickFury("Tomaso", "Ciampa");
		
		System.out.println();
		System.out.println(apples.getFirst());
		System.out.println(apples.getLast());
		System.out.println(NickFury.getMembers());		
		System.out.println();
		//instead of creating an object to access a static method you can just call the class name 
		//then you call the method directly 
		//Note static variables are shared among all objects 
		//and that you don't have to access static varibles using an object you just write the class name
		//plus the name of the static method 
		System.out.printf("The Number of Members are %s",NickFury.getMembers());

	
	}
	//note in 

}
