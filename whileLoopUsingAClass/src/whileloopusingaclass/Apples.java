package whileloopusingaclass;
import java.util.Scanner;
public class Apples {
Scanner nicky = new Scanner(System.in);
    int counter = 0;
    int sum = 0;
    
    
    public void addNum(int num ){
        while(counter < 5){
            System.out.println("Enter Number: ");
            num = nicky.nextInt();
            sum+=num;
            counter++;
        }
        
    }
    
    public int getSum(){
        return sum;
    }
    
    public void returnSum(){
        System.out.printf("The Result is: %d", getSum());
        System.out.println("");
    }

}
