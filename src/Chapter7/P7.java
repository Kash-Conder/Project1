package Chapter7;

import java.util.Scanner;

/**
 *
 * @author Mickey Loveless II
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the array --> ");
        int[] list = new int[input.nextInt()];

        fill(list);

        System.out.println("The average is " + average(list));

        show(list);
    }

    public static void fill(int[] arr) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your numbers --> ");
        for (int x = 0; x < arr.length; ++x) {
            arr[x] = input.nextInt();
        }
    }

    public static double average(int[] arr) {
        double sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return (double) (sum / arr.length);
    }

    public static void show(int[] arr) {
        System.out.print("The whole array is ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
