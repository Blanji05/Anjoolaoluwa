//Osunlana Anjoolaoluwa Victor
//230922
//200 Level

//A Java Program to grade an Olevel result

// Import the Scanner class to read user input.
import java.util.Scanner; 
//Define the public class named "Olevelresult"
public class Olevelresult {
    //Define the main method
    public static void main(String[] args) {
        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in); 
        // Prompt the user to enter the number of subjects.
        System.out.print("Enter the number of subjects: "); 
        // Read and store the number of subjects.
        int numSubjects = scanner.nextInt(); 

        // Initialize arrays to store subject names, scores, and grades.
        String[] subjectNames = new String[numSubjects];
        int[] subjectScores = new int[numSubjects];
        String[] subjectGrades = new String[numSubjects];
        //For loop 
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            // Consume the newline character.
            scanner.nextLine(); 
            // Read and store the subject name.
            subjectNames[i] = scanner.nextLine(); 
            //Prompt the user to enter score for each subjects
            System.out.print("Enter the score for " + subjectNames[i] + ": ");
             // Read and store the subject score.
            subjectScores[i] = scanner.nextInt();
            // Calculate and store the subject grade.
            subjectGrades[i] = calculateGrade(subjectScores[i]); 
        }

        int totalMarks = 0;
        for (int score : subjectScores) {
            // Calculate the total marks by summing up the subject scores.
            totalMarks += score; 
        }
        // Calculate the average.
        double average = (double) totalMarks / numSubjects;
        // Display subject-wise scores and grades. 
        System.out.println("\nSubject-wise Scores and Grades:"); 
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i] + ": " + subjectScores[i] + " - " + subjectGrades[i]);
        }

        // Display the average marks.
        System.out.println("Average Marks: " + average); 

        // Calculate the overall grade based on the average.
        String overallGrade = calculateGradeForAverage(average);
         // Display the overall grade.
        System.out.println("Overall Grade: " + overallGrade);
         // Close the Scanner to release resources.
        scanner.close();
    }

    // Method to calculate the letter grade for individual scores.
    public static String calculateGrade(int score) {
        if (score >= 75) {
            return "A1";
        } else if (score >= 70 && score <= 74) {
            return "B2";
        } else if (score >= 65 && score <= 69) {
            return "B3";
        } else if (score >= 60 && score <= 64) {
            return "C4";
        } else if (score >= 55 && score <= 59) {
            return "C5";
        } else if (score >= 50 && score <= 54) {
            return "C6";
        } else if (score >= 45 && score <= 49) {
            return "D7";
        } else if (score >= 40 && score <= 44) {
            return "E8";
        } else{
            return "F9";
        }
    }

    // Method to calculate the letter grade for the overall average.
    public static String calculateGradeForAverage(double average) {
        if (average >= 75) {
            return "Excellent Performance";
        } else if (average >= 65 && average <= 74) {
            return "Very Good Result, Keep it up";
        } else if (average >= 60 && average <= 64) {
            return "Good";
        } else if (average >= 50 && average <= 59) {
            return "Average Performance";
        } else  {
            return "Failed";
        } 
    }
}
