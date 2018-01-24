package Chapter4;

import java.util.Scanner;

/**
 * Program to find employee's salary
 *
 * @author Kash Conder
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user to enter an eployee's mame and inserts it into a String
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        //Prompt user to enter numb of hours worked and inserts it into a double
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        //Prompt user to enter hourly pay rate and turns it into a var
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        //Prompt user to enter federal tax withholding rate and turns it into a var
        System.out.print("Enter federal tax withholding rate: ");
        double federaltax = input.nextDouble();
        //asks user to enter state tax withholing rate and turns it into a var
        System.out.print("Enter state tax withholding rate: ");
        double statetax = input.nextDouble();

        //Calcs and Displays values according to names
        System.out.printf("\nEmployee's name: %4s%%", name);
        System.out.printf("\nHours worked %.2f%%", hours);
        System.out.printf("\nPay rate: $%.2f%%", rate);
        System.out.printf("\nGross pay: $%.2f", rate * hours);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal withholding: $%.2f%%", rate * federaltax * hours + (federaltax * 100));
        System.out.printf("\nState withholding: $%.2f%%", federaltax * rate * hours + (statetax * 100));
        System.out.printf("\nTotal deduction: $%.2f%%", hours * (federaltax + statetax) * rate);
        System.out.printf("\nNet Pay $%.2f%%", (1 - statetax - federaltax) * rate * hours);
    }

}
