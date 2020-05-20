package rollDice;
import java.util.Random;
public class Array {

    public static void main(String[] args) {
    Random nicky = new Random();
    //array
    int freq[] = new int[7];
    //rolling the dice 1000Times
    for(int x=0; x<1000; x++){
        ++freq[1+nicky.nextInt(6)];
    }
    
        System.out.println("Sides\tResults");
    
        for(int face=1; face<freq.length; face++){
            System.out.println(face + "\t" + freq[face]);
        }
    }

}
