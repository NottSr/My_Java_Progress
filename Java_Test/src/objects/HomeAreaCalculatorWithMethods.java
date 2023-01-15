package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Get the room values
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        // Calculate the total area
        double area = calculateTotalArea(kitchen, bathroom);

        scanner.close();

        // Output
        System.out.println("The total area is: " + area);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        // Method that calculates the area
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){

        // Method that asks for the room information and return a Rectangle object
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}
