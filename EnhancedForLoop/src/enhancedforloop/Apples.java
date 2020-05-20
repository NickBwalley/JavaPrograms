package enhancedforloop;
import java.util.Scanner;
public class Apples {
    Scanner nicky = new Scanner(System.in);
    int total = 0;
    int number;
    //array
    int rikki[] = new int[5];
    //method get user inputs
    public void getNumbers(){
        for(int x: rikki){
            System.out.println("Enter Your Number");
            number = nicky.nextInt();
            total+=number;
        }
    }
    
    public int returnSum(){
        return total;
    }
    
    public void printCrap(){
        System.out.printf("Result = %d", returnSum());
        System.out.println("");
    }
}
