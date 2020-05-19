package whileloopusingaclass;
import java.util.Scanner;
public class Apples {
Scanner nicky = new Scanner(System.in);
    int counter = 1;
    int sum = 0;
    
    
    public int addNum(int num ){
        while(counter < 10){
            System.out.println("Enter Number: ");
            num = nicky.nextInt();
            sum+=num;
            counter++;
        }
        return sum;
    }

}
