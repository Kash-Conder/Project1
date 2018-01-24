package Chapter3;

import java.util.Scanner;

/**
 * Program to check grades and compare them to other numbers
 *
 * @author Kash Conder
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Declare Vars
        Scanner scan = new Scanner(System.in);
        double x;
        double y;

        //Define Vars
        System.out.println("What's the first number?");
        x = scan.nextDouble();

        System.out.println("And the second number?");
        y = scan.nextDouble();

        //Compare numbers
        if (x < y) {
            System.out.println(x + " is less than " + y);
        }
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        if (x == y) {
            System.out.println(x + " is equal to " + y);
        }
        if (x <= y) {
            System.out.println(x + " is less than or equal to " + y);
        }
        if (x != y) {
            System.out.println(x + " is not equal to " + y);
        }

        // Making sure a fraction would be logical based on the numbers inputted
        if (y == 0) {
            System.out.println("Cannot divide by 0.");
        } else if (x / y < 1) {
            System.out.println("proper Fraction.");
        } else {
            System.out.println("Improper Fraction.");
        }
        // Checking Grade by comparing X to standard 10-point grading format
        if (x >= 90) {
            System.out.println("A");
        } else {
            if (x >= 80) {
                System.out.println("B");
            } else {
                if (x >= 70) {
                    System.out.println("c");
                } else {
                    if (x >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }
                }
            }
        }
        // Checking if the Second Number is within 1-100
        if (y >= 1 && y <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range.");
        }
    }
}
