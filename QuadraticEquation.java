//Osunlana Anjoolaoluwa Victor
//230922
//200level

//A Java Program to solve a Quadratic Equation

// Import the Scanner class to read input from the user
import java.util.Scanner; 
//Define the public class named 'QuadraticEquation'
public class QuadraticEquation {
    //Define the main method
    public static void main(String[] args) {
         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Display the title Quadratic equation
        System.out.println("Quadratic Equation");
        // Prompt the user to enter the coefficient 'a' of the quadratic equation
        System.out.print("Enter the coefficient 'a': ");
        // Read the 'a' coefficient from the user
        double a = scanner.nextDouble();
        // Prompt the user to enter the coefficient 'a' of the quadratic equation
        System.out.print("Enter the coefficient 'b': ");
        // Read the 'b' coefficient from the user
        double b = scanner.nextDouble();
        // Prompt the user to enter the coefficient 'a' of the quadratic equation
        System.out.print("Enter the coefficient 'c': ");
        // Read the 'c' coefficient from the user
        double c = scanner.nextDouble(); 

        // Calculate the discriminant using this formula
        double discriminant = (b * b) - (4 * a * c); 

        // Check the discriminant for real solutions
        if (discriminant > 0) { //If the discriminant is positive, two real roots exist
             // Calculate the first real root
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            // Calculate the second real root
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); 
            // Display the real roots
            System.out.println("Two real roots: Root1 = " + root1 + ", Root2 = " + root2); 
            
        } else if (discriminant == 0) { // If the discriminant is zero, there is one real root
            // Calculate the real root
            double root = -b / (2 * a); 
            // Display the real root
            System.out.println("One real root: Root = " + root); 
        } else { // If the discriminant is negative, there are complex roots
            // Calculate the real part of the complex roots
            double realPart = -b / (2 * a); 
             // Calculate the imaginary part of the complex roots
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            // Display the complex roots
            System.out.println("Complex roots: Root1 = " + realPart + " + " + imaginaryPart + "i, Root2 = " + realPart + " - " + imaginaryPart + "i"); 
        }
        // Close the Scanner to release resources
        scanner.close(); 
    }
}
