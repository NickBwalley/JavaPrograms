package arrays_multidimensional;
import java.util.Scanner;
public class NickFury {
Scanner nicky = new Scanner(System.in);
     
     int rikki[][] = new int[5][5];
     
    //method to get user input
    public void getInput(){
        //creating a for-loop to allow user to enter only 10Numbers
     double twoDm[][] = new double[4][4];
    Scanner scan = new Scanner(System.in);
    int i, j;

    for (i = 0; i < 2; i++) {
        System.out.print("Enter 4 numbers seperated by comma: ");
        String[] line = scan.nextLine().split(",");
           for (j = 0; j < 4; j++) {
            twoDm[i][j] = Double.parseDouble(line[j]);

            }
    }

        scan.close();
        for(int a = 0; a<rikki.length; a++){
            for(int b = 0; b < rikki.length; b++){
                System.out.print(twoDm[a][b]);
            }
            System.out.println();
        }
    }
}
