package polymorphism;

public class Main {

	public static void main(String[] args) {
		FoodStuff cleo = new FoodStuff();
		FoodStuff nicky = new Mango();
		FoodStuff rikki = new Lemon();
		cleo.eat();
		rikki.eat();
		nicky.eat();
		System.out.println("------------");
		
		FoodStuff biiy[] = new FoodStuff[3];
		biiy[0] = new Mango();
		biiy[1] = new Lemon();
		biiy[2] = new FoodStuff();
		
		for(int x=0; x<3; ++x) {
			biiy[x].eat();
		}
 		
	}

}

/*
 * Polymorphism: means many forms. Occurs when we have many classes which that are related to each other
 * by inheritance. Polymorphism uses those methods to perform different tasks. This allow us to perform a single 
 * action in different ways. For example a man. A man can be a husband can be an employee or a husband.*/
 