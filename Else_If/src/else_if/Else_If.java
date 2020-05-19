package else_if;
import java.util.Scanner;
public class Else_If {

    public static void main(String[] args) {
    Scanner nicky = new Scanner(System.in);
    int age;
        System.out.println("Enter your Age!");
        age = nicky.nextInt();
        
        if( age >=1 && age < 18)
            System.out.println("You are Still a Kid! Go Back to School And Learn!");
        else if(age >=18 && age <=21)
            System.out.println("You can Apply for an ID and Go to for Driving Lessons!");
        else if(age >=22 && age <=35)
            System.out.println("You can Now Be a Commercial Driver! ");
        else if(age >=36 && age <=49)
            System.out.println("You can Apply for a Green Card in USA!");
        else if(age >=50 && age <=100)
            System.out.println("You are OLD.. Just Retire and Stay Home!");
        else
            System.out.println("Invalid Age!");
    }

}
