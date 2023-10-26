//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java program to find the maximum number in a set of number

import java.util.Scanner;  
// Declare a Java class named maxnumber
public class maxnumber {  
     
    public static void main(String[] args) { 
         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 
        //Initializing n as an integer
        int n;
        //Creating a loop
        do {
            // Prompt the user to enter the number of elements
            System.out.print("Enter the number of elements: ");
            // Read and store the number of elements from the user  
            n = scanner.nextInt();  
            // Check if the input is not a positive number
            if (n <= 0) {  
                // Print an error message if the input is not a positive integer
                System.out.println("Please enter a positive number of elements.");
                // Prompt the user to enter the number of elements to be positive
                System.out.print("Enter the number of elements: ");
                // Read and store the number of elements from the user  
                n = scanner.nextInt();
                
            }
            // Continue the loop until a valid positive number is entered
        } while (n <= 0); 
         // Prompt the user to enter the numbers 

        System.out.print("Enter the numbers: "); 

        // Initialize a variable to store the maximum value (start with the lowest possible value)
        int max = Integer.MIN_VALUE;  
        // Loop to read 'n' numbers from the user
        for (int i = 0; i < n; i++) {  
            // Read a number from the user
            int num = scanner.nextInt();  
            // Loop through if the current number is greater than the current maximum
            if (num > max) { 
                 // Update the maximum value if the current number is greater 
                max = num; 
            }
        }
        
        // Check if no valid numbers were entered
        if (max == Integer.MIN_VALUE) { 
            // Print a message if no valid numbers were entered 
            System.out.println("No valid numbers were entered.");  
        } else {
              // Print the maximum number found
            System.out.println("The maximum number is: " + max);
        }
        // Close the Scanner to release system resources
        scanner.close();  
    }
}
