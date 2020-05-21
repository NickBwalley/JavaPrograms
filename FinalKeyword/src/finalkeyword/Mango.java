package finalkeyword;
import java.util.Scanner;
public class Mango {
Scanner nicky = new Scanner(System.in);
    private int sum;
    private int userInput;
    private final int NUMBER;
    
    public Mango(int number){
        NUMBER = number;
        System.out.println("Enter Your value: ");
        userInput = nicky.nextInt();        
    }
    
    public void Operation(){
        sum= NUMBER * userInput;
    }
    
    public int getResult(){
        return sum;
    }
    
    public String toString(){
        return String.format("The Result is: %d", getResult());
    }
}
