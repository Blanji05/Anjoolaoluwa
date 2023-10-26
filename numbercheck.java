//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java Program to check if a number is even or odd


// Import the Scanner class to read input from the user
import java.util.Scanner;
//Define the class named "numbercheck"
public class numbercheck {
    //Define the main method
    public static void main (String[] args) {
        // Create a Scanner object for user input.
        Scanner input = new Scanner(System.in);
        //Prompt user to enter an unteger number
        System.out.print("Enter an integer: ");
        //Read and store the number entered by the user.
        int number = input.nextInt();
        //Introduce an if function to check if the number is odd or even
        //Formula to check if a number is even. 
        if (number % 2 == 0) {
            //Display number entered is even.
            System.out.printf( number + " entered is even");
        }else {
            //Display number entered is odd
            System.out.print( number + " entered is odd");
        }
        //Close the input scanner to release system resources
        input.close();
    }
    
}
