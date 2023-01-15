package exceptions;

import java.util.Scanner;

public class ThrowingExceptions {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);){

            System.out.println("How many hours did you work?");
            double hours = scanner.nextDouble();
            System.out.println("What is your pay rate?");
            double payRate = scanner.nextDouble();

            double payment = calculatePay(hours, payRate);
            System.out.println("Your total will be: $" + payment);

        } catch (NegativeInputException e) {
            e.printStackTrace();
        }
    }

    public static double calculatePay (double hours, double payRate) throws NegativeInputException{
        if (hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40.");
        }
        if (hours < 0 || payRate < 0){
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
