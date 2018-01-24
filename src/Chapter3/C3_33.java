package Chapter3;

import java.util.Scanner;

/**
 * Program to decide which package has the best pricing based on unit prices
 *
 * @author Kash Conder
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Declare Vars
        Scanner scan = new Scanner(System.in);
        double x;
        double xPrice;
        double y;
        double yPrice;

        //Define Vars
        System.out.println("What are the weight and price of the first package?");
        x = scan.nextDouble();
        xPrice = scan.nextDouble();

        System.out.println("And the weight and price of the second package?");
        y = scan.nextDouble();
        yPrice = scan.nextDouble();

        //Set up Packages
        double package1 = (xPrice / x);
        double package2 = (yPrice / y);

        //Compare the two
        if (package1 < package2) {
            System.out.println("Package 1 has the best price.");
        } else {
            if (package1 > package2) {
                System.out.println("Package 2 has the best price.");
            } else {
                System.out.println("The packages have equal price.");
            }
        }
    }
}
