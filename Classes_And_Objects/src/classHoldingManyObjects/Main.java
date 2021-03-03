package classHoldingManyObjects;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		DogList doglist = new DogList();
		doglist.add(d1);
		doglist.add(d2);
		AnimalList ALO  = new AnimalList();
		Dog d3 = new Dog();
		Fish f1 = new Fish();
		ALO.add(d3);
		ALO.add(f1);
		
		

	}

}
