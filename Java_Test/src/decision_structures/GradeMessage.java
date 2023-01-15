package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    
    public static void main(String[] args){
        // Get the test score
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // Get the correct message
        String message = switch(grade){
            case "A" -> "Excellent Job!";
            case "B" -> "Great Job!";
            case "C" -> "Good Job";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade.";
        };

        // Output
        System.out.println(message);
    }
}
