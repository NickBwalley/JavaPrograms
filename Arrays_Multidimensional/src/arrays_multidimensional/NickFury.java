package arrays_multidimensional;
import java.util.Scanner;
public class NickFury {
    
    //method to get user input
    public void getInput(){
        //creating a for-loop to allow user to enter only 10Numbers
     int twoDm[][] = new int[4][4];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
        System.out.print("Enter 4 numbers seperated by comma: ");
        String[] line = scan.nextLine().split(",");
           for (int j = 0; j < 4; j++) {
            twoDm[i][j] = Integer.parseInt(line[j]);

            }
    }

        scan.close();
        for(int a = 0; a<twoDm.length; a++){
            for(int b = 0; b < twoDm.length; b++){
                System.out.print(twoDm[a][b]+"\t");
            }
            System.out.println("");
        }
    }
}
