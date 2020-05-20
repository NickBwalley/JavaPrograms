package variablelengtharguments;
import java.util.Scanner;
public class VariableLengthArguments {

    public static void main(String[] args) {
        Scanner nicky = new Scanner(System.in);
        int counter = 0;
        int rikki[] = new int[5];
        rikki[0] = 45;
        rikki[1] = 45;
        rikki[2] = 45;
        rikki[3] = 45;
        rikki[4] = 45;
        
        System.out.println(getAverage(rikki));
    }
    //Method to take Variable Length Arguments 
   public static int getAverage(int... numbers){
       int total = 0; 
    //Enhanced for loop
       for(int z: numbers)
           total+=z;
       return total;
   }

}
