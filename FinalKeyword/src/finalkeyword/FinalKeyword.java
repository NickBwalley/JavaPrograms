package finalkeyword;
import java.util.Scanner;
public class FinalKeyword {

    public static void main(String[] args) {
        Scanner rikki = new Scanner(System.in);
      /*  Apples apples = new Apples(10);
        
        for(int x=0; x<5; x++){
            apples.add();
            System.out.println(apples);
            
        }   */
        int constant;
        System.out.println("Enter Your Constant Number: ");
        constant = rikki.nextInt();
        Mango mango = new Mango(constant);
        
        System.out.println(mango.toString());
      
        
    }

}
