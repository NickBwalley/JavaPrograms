package forloop;
import java.util.Scanner;
public class ForLoop {

    public static void main(String[] args) {
    Scanner nicky = new Scanner(System.in);
    double amount;
    double capital;
    double rate;
        System.out.println("Enter Your Capital Amount: ");
        capital = nicky.nextDouble();
        System.out.println("Enter Your Rate of Interest: ");
        rate = nicky.nextDouble();
        
        for(int x=1; x<31; x++){
            amount = capital * Math.pow(1+rate, x);
            System.out.println("day\tAmount");
            System.out.println(x +"\t" + amount);
        }
    }

}
