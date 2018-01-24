package Chapter8;
import java.util.Scanner;
/**
 * Program to do something
 *
 * @author Kash Conder
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] overTime = new int[8][7];
        int[][] sum = new int[8][2];
        java.util.Scanner input = new Scanner(System.in);
        for (int i = 0; i < overTime.length; i++) {
            System.out.println("Enter Employee’s overtime " + i);
            for (int j = 0; j < overTime[0].length; j++) {
                overTime[i][j] = input.nextInt();
            }

        }

        //The sum loop
        for (int i = 0; i < overTime.length; i++) {
            for (int j = 0; j < overTime[0].length; j++) {
                sum[i][1] += overTime[i][j];
            }
            sum[i][0] = i;
        }

        selectionSort(sum);

        //Prints!
        //Printing result
        for (int j = sum.length - 1; j >= 0; j--) {
            System.out.println("Employee " + sum[j][0] + "'s overtime is "
                    + sum[j][1]);
        }

    }

    public static void selectionSort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j][1]) {
                    currentMin = list[j][1];
                    currentMinIndex = j;
                }
            }

            // Swap certain arrays if needed
            if (currentMinIndex != i) {
                list[currentMinIndex][1] = list[i][1];
                list[i][1] = currentMin;
                list[currentMinIndex][0] = list[i][0];
                list[i][0] = currentMinIndex;

            }
        }
    }

}
