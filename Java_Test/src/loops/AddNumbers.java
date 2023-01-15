package loops;

import java.util.Scanner;

public class AddNumbers {
    
    public static void main(String[] args){
        // Initialize variables and Scanner
        Scanner scanner = new Scanner(System.in);
        int runAgain = 0;

        // Condition that will sum entered values
        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;

            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to start again? Type 1 for Yes, 2 for No");
            runAgain = scanner.nextInt();
        }while(runAgain == 1);

        scanner.close();
    }
}
