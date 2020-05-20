package arrays_initializer;
import java.util.Scanner;
public class NickFury {
    Scanner nicky = new Scanner(System.in);
    //int number;
    int apples[] = new int[5];
    
    public void fillArray(int a){
        for(int i=0; i<apples.length; i++){
            System.out.println("Enter Number: ");
            apples[i] = nicky.nextInt();
        }
        System.out.println("----------\nNumbers are:");
        for(int y=0; y<5; y++){
            
            System.out.println(apples[y]);
        }
    }

}
