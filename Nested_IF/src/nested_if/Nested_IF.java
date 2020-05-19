package nested_if;
import java.util.Scanner;
public class Nested_IF {

    public static void main(String[] args) {
        Scanner nicky  = new Scanner(System.in);
        int age;
        
        System.out.println("Enter Your Age: ");
        age = nicky.nextInt();
        
        if(age < 18)
            System.out.println("Your Are Still a Kid!");
        else
            System.out.println("You Are Not a Kid!");
            if(age > 50)
                System.out.println("You are OLD!");
            if(age > 75)
                System.out.println("You are Really OLD!");
            
    }

}
