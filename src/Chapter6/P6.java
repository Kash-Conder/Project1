package Chapter6;

import java.util.Scanner;

/**
 * Program for converting currencies based on dollar to "x" conversions
 *
 * @author Kash Conder
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Rate Vars
        double euro;
        double pounds;
        double yen;
        double dollars;
        // Bought Vars
        double eurosBought;
        double poundsBought;
        double yenBought;
        // Currency codes for each currency
        String currency;
        // User reply if they want to perform more conversions
        String reply;

        // Prompting for exchange rates
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        euro = input.nextDouble();
        System.out.print("How many Pounds does a dollar buy? ");
        pounds = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        yen = input.nextDouble();

        // Loop
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            currency = input.next().toUpperCase();

            // Chosing the conversion to perform
            switch (currency) {
                case "E":
                    eurosBought = conversion(dollars, euro);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;
                case "P":
                    poundsBought = conversion(dollars, pounds);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.\n", dollars, poundsBought);
                    break;
                case "Y":
                    yenBought = conversion(dollars, yen);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", dollars, yenBought);
                    break;
            }

            // Repeat?
            do {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));

        } while (reply.equalsIgnoreCase("yes"));
    }

    /**
     * Method for returning Double values for conversions
     *
     * @param dollars //has the original value set by user to be converted
     * @param exchangeRate //has the conversion rate of U.S dollars to the
     * chosen currency
     * @return //method returns the total amount of money received and inserts
     * it into the variable "Conversion"
     */
    public static double conversion(double dollars, double exchangeRate) {
        // Exchange service charge
        double result = (dollars > 100.0) ? dollars * 0.95 * exchangeRate : dollars * 0.90 * exchangeRate;

        // Amount of foreign currency bought 
        return result;
    }
}
