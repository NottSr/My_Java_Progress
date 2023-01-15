package decision_structures;

import java.util.Scanner;

public class MakingDollars {
    
    public static void main(String[] args){
        // Initialize known values
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        System.out.println("Welcome to change for a Dollar!" + 
            " Your goal is to enter enough change to make exaclty $1.00");

        // Get the unknown values
        Scanner scanner = new Scanner(System.in);

        double res = 0;

        System.out.println("Enter your number of pennies:");
        res += (scanner.nextInt() * penny);
        System.out.println("Enter your number of nickels:");
        res += (scanner.nextInt() * nickel);
        System.out.println("Enter your number of dimes:");
        res += (scanner.nextInt() * dime);
        System.out.println("Enter your number of quarters:");
        res += (scanner.nextInt() * quarter);

        scanner.close();

        // Comparing the final result
        if(res > dollar){
            System.out.println("Uh oh! You were over by " + (res - dollar) + " cents.");
        }
        else if(res < dollar){
            System.out.println("Uh oh! You were under by " + (dollar - res) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
