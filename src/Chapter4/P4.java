package Chapter4;

import java.util.Scanner;

/**
 * Program to decide which bidder's offer is best based on hourly rate and hours
 *
 * @author Kash Conder
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user to enter a name for the first bidder 
        System.out.print(" The information below pertains to the first bidder: \n");
        System.out.print(" Enter Your name: ");
        String bidder1 = input.next();

        //Prompt user to input how many hours the first bidder requires
        System.out.print(" How many hours do you require? ");
        int bidder1hours = input.nextInt();

        //Prompt user to input how much the first bidder charges per hour 
        System.out.print("How much do you charge per hour? $");
        double bidder1charge = input.nextDouble();

        //Prompt user to enter a name for the second bidder  
        System.out.print(" The information below pertains to the second bidder: \n");
        System.out.print(" Enter your name ");
        String bidder2 = input.next();

        //Prompt user to input how many hours the second bidder requires
        System.out.print(" How many hours do you require? ");
        int bidder2hours = input.nextInt();

        //Prompt user to input how much the second bidder charges per hour
        System.out.print("How much do you charge per hour? $ ");
        double bidder2charge = input.nextDouble();

        //declares hourly for bidders 1 and 2
        double hourlyrate1 = bidder1hours * bidder1charge;
        double hourlyrate2 = bidder2hours * bidder2charge;

        //Decide if bidder 1 or 2 wins based on who's hourly rate is less 
        if (hourlyrate1 < hourlyrate2) {
            System.out.printf(" Winner is %s with a price of %.2f", bidder1, hourlyrate1);
        }

        if (hourlyrate1 > hourlyrate2) {
            System.out.printf(" Winner is %s with a price of %.2f", bidder2, hourlyrate2);
        }

        //Decide if both bidder 1 and 2 have equal hourly rates and who has more hours
        if (hourlyrate1 == hourlyrate2 && bidder1hours < bidder2hours) {
            System.out.printf("Winner is %s with a price of %.2f", bidder1, hourlyrate1);
        }

        if (hourlyrate1 == hourlyrate2 && bidder1hours > bidder2hours) {
            System.out.printf("Winner is %s with a price of %.2f", bidder2, hourlyrate2);
        }

        //Decide if both hourly rates and hours are equal 
        if (hourlyrate1 == hourlyrate2 && bidder1hours == bidder2hours) {
            System.out.println("Both " + bidder1 + " and " + bidder2 + " have identical bids ");
            System.out.println(" ");
            System.out.printf("First bidder = %s ", bidder1hours);
            System.out.printf("Second bidder = %s ", bidder2hours);
            System.out.println(" ");
            System.out.printf("First bidder = %s ", bidder1charge);
            System.out.printf("Second bidder = %s ", bidder2charge);
            System.out.println(" ");
            System.out.printf("First bidder = %s ", hourlyrate1);
            System.out.printf("Second bidder = %s ", hourlyrate2);
        }

    }
}
