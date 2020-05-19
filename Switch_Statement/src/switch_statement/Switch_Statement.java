package switch_statement;
import java.util.Scanner;
public class Switch_Statement {

    public static void main(String[] args) {
        Scanner nicky = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age!");
        age = nicky.nextInt();
        
        switch(age){
            case 18:
                System.out.println("You Can Now Apply For an ID!");
                break;
            case 19:
                System.out.println("You Can Now Join a Driving School!");
                break;
            case 20:
                System.out.println("You Can Now drive a Nissan!");
                break;
            case 21: 
                System.out.println("You Are Fit to Join the Army!");
                break;
            default:
                System.out.println("You Age Does not Fit to Play this Game!");
        }
        
    }

}
