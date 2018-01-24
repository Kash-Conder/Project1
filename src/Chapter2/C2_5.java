package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate tip and total amount after finding meal value and grat
 *
 * @author Kash Conder
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Declare Vars
        Scanner scan = new Scanner(System.in);
        double subtotal;
        double gratuity;
        double tip;
        double total;

        //Prompt user to define Vars
        System.out.println("How much was the meal?");
        subtotal = scan.nextDouble();
        System.out.println("What was the gratuity rate?");
        gratuity = scan.nextDouble();

        //Calculate Tip and Total
        tip = gratuity / 100 * subtotal;
        total = subtotal + tip;

        //Display results
        System.out.println("For an order of “ + subtotal + “ the amount you should tip is " + tip + " For a total payment of " + total);
    }

}
