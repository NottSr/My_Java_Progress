package abstraction.shapes;

public class Rectangle extends Shape {
    
    private double length;
    private double width;

    // Default constructor
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    // Abstract method
    @Override
    double calculateArea(){
        return length * width;
    }

    // Length getter and setter
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    // Width getter and setter
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
