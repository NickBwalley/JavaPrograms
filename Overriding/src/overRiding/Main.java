package overRiding;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal d = new Dog();
		
		a.move();
		d.move();
		d.barks();
	}

}
