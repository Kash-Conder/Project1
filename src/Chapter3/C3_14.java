package Chapter3;
import java.util.Scanner;
/**
 * Program to flip a coin
 *
 * @author Kash Conder
 */

public class C3_14 {
/**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
    public static void main(String[] args) {

        //Declare Vars
        Scanner scan = new Scanner(System.in);
        int guess;
        int result;

        //Define Vars
        result = (int) (Math.random() * 2);

        System.out.println("Heads or tails? (Please use 0 for heads and 1 for tails) ");
        guess = scan.nextInt();

        //Deciding what to what result to display
        if (guess == result) {
            System.out.println("Tails!");
        } else {
            System.out.println("Heads!");
        }
    }
}
