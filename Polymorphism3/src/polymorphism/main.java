package polymorphism;

public class main {

	public static void main(String[] args) {
		Animals an = new Animals();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Mouse mouse = new Mouse();
		
		an.eat(dog);
		an.eat(cat);
		an.eat(mouse);
		
	}

}
