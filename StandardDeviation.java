//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java Program to solve a Standard Deviation

// Import the Scanner class for user input
import java.util.Scanner; 
//Define the public class named 'StandardDeviation'
public class StandardDeviation {
    //Define the main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: "); 
         // Read and store the user's input as the number of elements
        int n = inputScanner.nextInt();

        // Create an array to store the data entered by the user
        double[] data = new double[n]; 
        
        // For Loop to get user input for each element
        for (int i = 0; i < n; i++) {
            // Prompt the user to enter an element
            System.out.print("Enter element " + (i + 1) + ": "); 
            // Read and store the user's input as an element in the array
            data[i] = inputScanner.nextDouble(); 
        }
        // Declare the function mean of the data
        double mean = calculateMean(data); 
        // Declare the function standard deviation
        double standardDeviation = calculateStandardDeviation(data, mean); 
        
        // Display the mean and standard deviation
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
        // Close the Scanner to release system resources
        inputScanner.close(); 
    }

    // Function to calculate the mean
    public static double calculateMean(double[] data) {
        double sum = 0;
        // For Loop to calculate the sum of all elements in the data
        for (double num : data) {
            sum += num;
        }
        // Calculate and return the mean by dividing the sum by the number of elements
        return sum / data.length;
    }

    // Function to calculate the standard deviation
    public static double calculateStandardDeviation(double[] data, double mean) {
        double sumOfSquaredDifferences = 0;
        // Loop to calculate the sum of squared differences from the mean
        for (double num : data) {
            double difference = num - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        // Calculate and return the standard deviation by taking the square root of the average of squared differences
        return Math.sqrt(sumOfSquaredDifferences / data.length);
    }
}
