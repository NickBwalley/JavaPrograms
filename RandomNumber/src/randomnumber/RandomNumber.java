package randomnumber;
import java.util.Random;
public class RandomNumber {

    public static void main(String[] args) {
    Random nicky = new Random();
        int dice;
        
        System.out.println("Rolls\tDiceSide");
        
        for(int x=1; x<=6; x++){
            dice = 1+nicky.nextInt(6);
            System.out.println(x + "\t" + dice);
        }
    }

}
