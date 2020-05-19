package computesumofnum_scanner.in;
import java.util.Scanner;
public class ComputeSumOfNum_ScannerIn {

    public static void main(String[] args) {
    Scanner nicky = new Scanner(System.in);
    int counter = 1;
    int sum = 0;
    int num;
    
    while(counter < 10){
        System.out.println("Enter Number: ");
        num = nicky.nextInt();
        sum+=num;
        counter++;
    }
    
        System.out.println("Result is: "+ sum);
    }

}
