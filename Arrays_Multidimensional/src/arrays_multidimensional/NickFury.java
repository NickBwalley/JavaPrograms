package arrays_multidimensional;
import java.util.Scanner;
public class NickFury {
Scanner nicky = new Scanner(System.in);
     
     int rikki[][] = new int[5][5];
     
    //method to get user input
    public void getInput(){
        //creating a for-loop to allow user to enter only 10Numbers
        for(int x=0; x<rikki.length; x++){
            System.out.println("Enter Row-Values: ");
            rikki[x] = nicky.nextInt();
            for(int y=0; y<rikki[x].length; y++){
                System.out.println("Enter Column-Values: ");
                rikki[y] = nicky.nextInt();
            }
            
        }
        
    }
}
