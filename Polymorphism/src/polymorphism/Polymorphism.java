package polymorphism;

public class Polymorphism {

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
