//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java program to solve factorial operations

// Import the Scanner class from the java.util package to read user input.
import java.util.Scanner;

// Define the public class named factorial.
public class factorial {
    // Define the main method
    public static void main(String[] args) {
        // Create a Scanner object  to read user input.
        Scanner scanner = new Scanner(System.in);

       // Display a prompt to the user to enter a non-negative integer.
        System.out.print("Enter a non-negative integer: ");

        // Read and store "number" variable.
        int number = scanner.nextInt();

        

        // Check if the entered number is negative.
        if (number < 0) {
            // Display an error message if the number is negative.
            System.out.println("Factorial is not defined for negative numbers.");    
        } else {
            // Calculate the factorial of the non-negative number.
            long factorial = calculateFactorial(number);

            // Display the calculated factorial.
            System.out.println("The Factorial of " + number + " is: " + factorial);

        // Close the Scanner to release system resources.
        scanner.close();
        }
    }

    // Define a recursive method to calculate the factorial.
    public static long calculateFactorial(int n) {
        // If n is 0 or 1, return 1.(factorial of 0 and 1 is 1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            //Calculate n * (n-1)! using recursion.
            return n * calculateFactorial(n - 1);
        }
    }
}
