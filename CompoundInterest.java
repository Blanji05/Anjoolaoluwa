//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java Program to Cakculate Compound Interest


// Import the Scanner class to read user input
import java.util.Scanner; 
//Define the public class CompoundInterest
public class CompoundInterest {
     // Define the main method
     public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in); 
        // Display a prompt to the user.
        System.out.print("Enter the Principal(P): ");
        // Read and store the principal 
        double Principal = input.nextDouble(); 
        // Display a prompt to the user.
        System.out.print("Enter the Interest rate (r): ");
        // Read and store the annual interest rate
        double Rate = input.nextDouble(); 
        // Display a prompt to the user.
        System.out.print("Enter the number of times (n) interest is compounded per year (n): ");
         // Read and store the value of n
        int frequency = input.nextInt();
        // Display a prompt to the user.
        System.out.print("Enter the number of years (t): ");
         // Read and store the number of years
        double time = input.nextDouble();

        // Calculate compound interest
        // Convert annual rate to a decimal
        double rate = Rate / 100; 
         // Calculate the Amount using the compound interest formula. math.pow raise the value after the comma into power
        double Amount = Principal * Math.pow(1 + (rate / frequency), (frequency * time));
       

        // Print the result
        // Display the calculated total amount with two decimal places
        System.out.printf("The total amount of the investment is: %.2f%n", Amount);
        
        // Close the Scanner to release system resources
        input.close(); 
    }
}
