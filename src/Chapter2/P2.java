package Chapter2;
import java.util.Scanner;
/**
 * Program to calculate meal total cost in more depth than previous code
 *
 * @author Kash Conder
 */

public class P2 {
/**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
    public static void main(String[] args) {

        // Declare Vars
        Scanner scan = new Scanner(System.in);
        double meal;
        double drink;
        double dessert;
        double subtotal;
        double tax;
        double tip;
        double total;

        // Define Vars and Prompt the User for Info
        System.out.println("How Expensive Was the Meal?");
        meal = scan.nextDouble();

        System.out.println("How Much Was the Drink?");
        drink = scan.nextDouble();

        System.out.println("And the Dessert?");
        dessert = scan.nextDouble();

        subtotal = dessert + drink + meal;

        tax = subtotal * (10.0 / 100);

        tip = (subtotal + tax) * (15.0 / 100);

        total = subtotal + tax + tip;

        // Print out the total price
        System.out.println("Wow, with a tax of " + tax + " And a tip of " + tip + " the total price is " + total);
    }
}
