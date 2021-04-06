package arraysHoldingManyObjects;

public class Main {

	public static void main(String[] args) {
		AnimalList AL = new AnimalList();
		Dog d = new Dog();
		Cat c = new Cat();
		AL.add(d);
		AL.add(c);
		AL.add(d);
		AL.add(c);
		AL.add(d);
		
	}

}
