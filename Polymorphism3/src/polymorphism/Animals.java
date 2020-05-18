package polymorphism;

public class Animals {
	void eat() {
		System.out.println("I am the Animals Class!");
	}
	void eat(Animals x) {
		x.eat();
	}
}
