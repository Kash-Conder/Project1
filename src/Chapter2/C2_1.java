package Chapter2;

import java.util.Scanner;

/**
 * Program to convert given temp in celsius to fahrenheit
 *
 * @author Kash Conder
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Declaring Vars
        Scanner scan = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        // Define celsius
        System.out.println("Enter the degrees in Celsius: ");
        celsius = scan.nextDouble();
        // Define Fahrenheit
        fahrenheit = (9.0 / 5) + celsius + 32;

        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees fahrenheit.");
    }
}
