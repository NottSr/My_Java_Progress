package inheritance;

public class Garage {
    
    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("Red");

        System.out.println(
            String.format("My car is %s and has %d doors.",
                myCar.getColor(), myCar.getDoors())
        );
    }
}
