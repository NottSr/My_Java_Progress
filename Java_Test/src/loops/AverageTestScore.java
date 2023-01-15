package loops;

import java.util.Scanner;

public class AverageTestScore {
    
    public static void main(String[] args){
        // Initialize known variables
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i = 0; i < numberOfStudents; i++){

            double total = 0;
            // Process all students tests
            for(int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for test #" + (j + 1));
                total += scanner.nextDouble();
            }

            double average = total / numberOfTests;
            System.out.println("The test average for this student #" + (i + 1) + " is: " + average);
        }

        scanner.close();
    }
}
