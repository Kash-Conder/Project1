
import java.util.Scanner;

/**
 * Program to play "rock, paper, scissors" against computer
 *
 * @author Kash Conder
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //Declare Vars
        int compWin;
        int playerWin;
        int player;
        int comp;
    //Set up loop to replay the game until someone wins 2 times
    do {
        //Prompt player for their throw
        System.out.println("Welcome! Please select 0 for rock, 1 for paper, or 2 for scissors!");
        player = input.nextInt();
        //Have computer's value be randomized
        comp = (int) (Math.random() * 3);
        //Deciding winner!
        //Computer wins
        if(comp > player && player != 0){
            System
        }
    }
    }
}