package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		FoodStuff foodObj = new FoodStuff();
		foodObj.eat();
		Apple appleObj = new Apple();
		appleObj.eat();
		Orange orangeObj = new Orange();
		orangeObj.eat();
		System.out.println("------------");
		
		FoodStuff nicky[] = new FoodStuff[3];
		nicky[0] = new FoodStuff();
		nicky[1] = new Apple();
		nicky[2] = new Orange();
		
		for(int x = 0; x < 3; ++x) {
			nicky[x].eat();
		}
	}

}
