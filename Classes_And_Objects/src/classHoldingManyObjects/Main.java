package classHoldingManyObjects;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		DogList doglist = new DogList();
		doglist.add(d1);
		doglist.add(d2);

	}

}
