package objects;

public class HomeAreaCalculator {
    
    public static void main(String[] args) {

        // Creating rooms using the Rectangle object
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        // Output
        System.out.println("The area of the first room is: " + areaOfRoom1);
        System.out.println("The area of the second room is: " + areaOfRoom2);
    }
}
