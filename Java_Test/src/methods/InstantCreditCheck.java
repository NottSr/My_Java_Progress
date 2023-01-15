package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    
    public static void main(String[] args){
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        // Check if the user is qualified
        boolean isQualified = isUserQualified(creditScore, salary);

        // Output
        notifyUser(isQualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        // Known variables
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        // Condition to check eligibility
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        // Condition to check eligibility and print
        if (isQualified){
            System.out.println("Congrats! You've been approved!");
        }
        else{
            System.out.println("Sorry, You've been declined.");
        }
    }
}
