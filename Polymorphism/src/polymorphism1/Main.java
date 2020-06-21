package polymorphism1;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        Food nicky = new Food();
        Rice rice = new Rice();
        Beans beans = new Beans();
        nicky.eat();
        rice.eat();
        beans.eat();
        System.out.println("---------------------------");
        Food nicky2 = new Food();
        nicky2.digest(rice);
        nicky2.digest(beans);
    }

}
/*	QUALITIES OF AN ABSTRACT CLASS AND ABSTRACT METHODS 
 * Abstract Class must be overridden 
 * 1. Abstract Class you cannot create an object out of it
 * 2. When you have a method inside a class the whole class needs to be labeled abstract
 * 3. Abstract class does not have a body
 * 4. Each time you have an abstract class in the super class then the subclasses need to override this abstract class
 * */
