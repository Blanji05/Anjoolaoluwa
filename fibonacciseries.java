//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//Import the scanner class to read user inputs
import java.util.Scanner;
//Declare a public class 'fibonacciseries'
public class fibonacciseries {
    //Define the main method
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
         // Declare a variable to store the number of terms in the Fibonacci series
        int numberOfTerms;
        //A do-while loop to ensure the user enters a non-negative number of terms
    do{
        // Prompt the user to enter the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
         // Read the user's input as an integer
        numberOfTerms = scanner.nextInt();
        // Check if the user input is less than or equal to 0
        
        if (numberOfTerms <= 0) {
            // If so, display an error message
            System.out.println("Please enter a non-negative number of terms.");      
        } 
    } while (numberOfTerms <= 0); // Continue the loop until a valid input (when number of terms is greater than 0) is provided
        // Initialize the first number in the sequence
        int firstNumber = 0; 
        // Initialize the second number in the sequence       
        int secondNumber = 1;

         // Display a message indicating the number of terms for the custom Fibonacci series
        System.out.print("Fibonacci Series up to " + numberOfTerms + " terms: ");

        // Generate the Fibonacci series starting from the third term
        for (int i = 0; i < numberOfTerms; i++) {
              // Calculate the next number in the sequence
            int nextNumber = firstNumber + secondNumber;
             //Print the current number in the series
            System.out.print(firstNumber + " ");
            //Update the first and second numbers for the next iteration
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

       
        // Close the scanner to release resources 
        scanner.close();
    }
}
