package polymorphism1;

public class Food {
    public void eat(){
        System.out.println("This is the food Class!..");
    }
    
    public void digest(Food x){
        x.eat();
    }
}
