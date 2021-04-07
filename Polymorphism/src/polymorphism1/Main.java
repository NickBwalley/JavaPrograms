package polymorphism1;

public class Main {

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
		System.out.println("-------------");
		FoodStuff food_stuff = new FoodStuff();
		FoodStuff apple = new Apple();
		FoodStuff orange = new Orange();
		Digests dig = new Digests();
		
		dig.digest(food_stuff);
		dig.digest(apple);
		dig.digest(orange);
	}

}
