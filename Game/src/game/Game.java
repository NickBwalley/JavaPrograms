package game;
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        guessingGame();
    }
    
    //method guessing_Game
    public static void guessingGame(){
        int lucky_number, guess;
        int guess_count = 0;
        int guess_limit = 3;
        
        lucky_number = 79;
        guess = 0;
        
        Scanner nicky = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Guessing-Game: Hint(Arg): You have 3Trials");
        System.out.println("---------------------------------------------");
        //System.out.println("Enter Your Guess: ");
        //guess = nicky.nextInt();
        for(int i = 0; i < 3; i++ ){
            if(guess != lucky_number){
            System.out.println("Enter Your Guess: ");
            guess = nicky.nextInt();
            }
            else if(guess == lucky_number ){
                //System.out.println("You Win!..");
                break;
            }
        }
        if(guess!= lucky_number){
            System.out.println("You Lose!");
        }else{
            System.out.println("You Win!");
        }
        
    }

}
