package Chapter7;

import java.util.Scanner;

/**
 * Program to set 10 numbers into an array
 *
 * @author Kash Conder
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//Gettin the numbers
        System.out.print("Enter ten numbers:");
        Scanner input = new Scanner(System.in);
//Array settup
        double[] nums = new double[10];
//Loop
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        //Declaring min num
        System.out.println("The minimum number is: " + min(nums));
    }

    /**
     * Method to setup array
     *
     * @param array
     */
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }
}
