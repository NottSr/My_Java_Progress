package loops;

import java.util.Scanner;

public class Cashier {
    
    public static void main(String[] args){
        // Get number of items to scan
        System.out.println("Enter the number of items would you like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        double total = 0;

        // Create loop to iterate trhough all the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();
            total += price;
        }

        scanner.close();

        // Output
        System.out.println("The total would it be: $" + total);
    }
}
