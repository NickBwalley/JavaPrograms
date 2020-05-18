
package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        
        Mammals nicky = new Mammals();
        nicky.eat(dog);
        nicky.eat(cat);
    }
    
}
