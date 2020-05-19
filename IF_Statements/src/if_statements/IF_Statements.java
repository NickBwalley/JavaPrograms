package if_statements;
import java.util.Scanner;
public class IF_Statements {

    public static void main(String[] args) {
        Scanner nicky = new Scanner(System.in);
        int num;
        System.out.println("Enter Your age");
        num = nicky.nextInt();
        
        if(num < 18 ){
            System.out.println("You Are Under-Age...Go Back To School and Learn!");
        }else{
            System.out.println("You are Welcome to to register in this Club ");
        }
    }

}
