package Chapter3;

import java.util.Scanner;

/**
 * Program to check if given number is divisible by 5, 6, or 5 and 6
 *
 * @author Kash Conder
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Declare Vars
        Scanner scan = new Scanner(System.in);
        int x;

        //Prompt User for value of X
        System.out.println("Please choose a whole number.");
        x = scan.nextInt();

        //Check if x is divisible by 5 AND 6
        if (x % 5 == 0 && x % 6 == 0) {
            System.out.println(x + " is divisible by 5 and 6.");
        } else {
            if (x % 5 == 0 || x % 6 == 0) {
                System.out.println(x + " is divisible by 5 or 6");
                System.out.println(x + " is divisible by 5 or 6, but not both");
            } else {
                System.out.println(x + " is divisible by neither 5 nor 6");
            }
        }
    }
}
