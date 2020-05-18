package polymorphism;

public class main {

	public static void main(String[] args) {
		Animals an = new Animals();
		Dog dog = new Dog();
		Cat cat = new Cat();

		
		an.eat(dog);
		an.eat(cat);

		
	}

}
