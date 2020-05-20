package rollDice;
import java.util.Random;
public class Array {

    public static void main(String[] args) {
    Random nicky = new Random();
    int freq[] = new int[7];
        for(int x=0; x<5; x++){
            ++freq[1+nicky.nextInt(6)];
        }
        
        System.out.println("People\tSweets");
        
        for(int sweet=1; sweet<freq.length; sweet++){
            System.out.println(sweet + "\t" + freq[sweet]);
        }
    }

}
