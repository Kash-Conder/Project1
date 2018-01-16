package Chapter1;

/**
 * Program to find the perimeter and area of a circle after giving a radius and
 *
 * @author Kash Conder
 */

public class C1_8 {
/**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area
        double perimeter; // Declare perimeter
        // Assign a radius
        radius = 5.5;
        // Step 2: Compute area and perimeter
        area = radius * radius * 3.14159;
        perimeter = radius * 2 * 3.14159;
        // Step 3: Display the area
        System.out.println("The area for the circle of the radius " + radius + " is " + area);
        System.out.println("The perimeter for the circle of the radius " + radius + " is " + perimeter);
    }
}
