
package userinput_scannerin;

import java.util.Scanner;
public class UserInput_ScannerIn {

    public static void main(String[] args) {
        String fname;
        Scanner nicky = new Scanner(System.in);
        System.out.println("What is Your Name: ");
        fname = nicky.nextLine();
        System.out.println("Your Name is: "+fname);
    }
    
}
