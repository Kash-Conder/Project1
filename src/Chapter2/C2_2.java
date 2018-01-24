package Chapter2;

import java.util.Scanner;

/**
 * Program to find the area and volume of cylinder with given radius and length
 *
 * @author Kash Conder
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declare Vars
        double area;// Declare area as a double var
        double radius; // Declare radius as a double var
        double length; // Declare length as a double var
        double volume; // Declare volume as a double var

        //Prompt user to define Vars
        System.out.println("What is the radius?");
        radius = scan.nextDouble();
        System.out.println(" and what is the length?");
        length = scan.nextDouble();

        //Calculate area and volume
        area = radius * radius * 3.141596;
        volume = area * length;

        //Display results
        System.out.println("The volume of a cylinder with a length of " + length + " and a radius of " + radius + " is " + volume + " and the area is " + area);
    }

}
