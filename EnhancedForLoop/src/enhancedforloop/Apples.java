package enhancedforloop;
import java.util.Scanner;
public class Apples {
    int total = 0;
    //array
    int rikki[] = new int[5];
    //method get user inputs
    public void getNumbers(){
        for(int x: rikki){
            System.out.println("Enter Your Number");
            total+=x;
        }
    }
    
    public int returnSum(){
        return total;
    }
}
