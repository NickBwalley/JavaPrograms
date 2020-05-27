package game;
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        guessingGame();
    }
    
    //method guessing_Game
    public static void guessingGame(){
        String secret_word, guess;
        int guess_count, guess_limit;
   
        secret_word = "Silver";
        guess = "";
        guess_count = 0;
        guess_limit = 3;
        
        Scanner nicky = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Guessing-Game: Hint(Arg): You have 3Trials");
        System.out.println("---------------------------------------------");
        
        while(guess!=secret_word){
            if(guess_count < guess_limit ){
                System.out.println("Enter Your Guess: ");
                guess = nicky.nextLine();
            }
        }
        
    }

}
