//Osunlana Anjoolaoluwa Victor
//230922
//200 Level


//A java program to solve Simple Interest

// Import the Scanner class from the java.util package for user input.
import java.util.Scanner; 
// Define a class named SimpleInterest.
public class SimpleInterest { 
    // Define the main method.
    public static void main(String[] args) { 
        // Create a Scanner object for user input.
        Scanner input = new Scanner(System.in); 
         // Display a prompt to the user.
        System.out.print("Enter the Principal(P): ");
        // Read and store the principal amount entered by the user. Double is the combinaion of int and floats numbers.
        double Principal = input.nextDouble(); 
        // Display a prompt to the user.
        System.out.print("Enter the Interest rate(R): "); 
        // Read and store the interest rate entered by the user.
        double Rate = input.nextDouble(); 
         // Display a prompt to the user.
        System.out.print("Enter the Time (T) in years: ");
         // Read and store the time (in years) entered by the user.
        double Time = input.nextDouble();
        

        // Calculate simple interest using the provided formula.
        double simpleInterest = (Principal * Rate * Time) / 100;
         // Display the calculated simple interest.
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the input Scanner to release system resources.
        input.close(); 
    }
}
