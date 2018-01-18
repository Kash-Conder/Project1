package Chapter6;

import java.util.Scanner;

/**
 * Program to set up password using various authenticators
 *
 * @author Kash Conder
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//Declaring Vars
        Scanner input = new Scanner(System.in);
        String password;
//Prompt for password
        System.out.println("Enter Password");
        password = input.next();
        if (isValid(password) == true) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid entry");
        }
    }

    public static boolean isValid(String password) {
//More vars
        int counter = 0;
//Rules!
//8 character min
        if (password.length() < 8) {
            return false;
        }
//No symbols
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
//2 digit min
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }
//Setting true as default return
        return true;
    }
}
