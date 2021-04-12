package nestedifstatements2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int age;
        
        System.out.println("Enter Your Age: ");
        age = input.nextInt();
        
        if(age < 18)
            System.out.println("Your Are Still a Kid!");
        else
            System.out.println("You Are Not a Kid!");
            if(age > 50)
                System.out.println("You are OLD!");
            if(age > 75)
                System.out.println("You are Really OLD!");
        
        input.close();    
    }

}
