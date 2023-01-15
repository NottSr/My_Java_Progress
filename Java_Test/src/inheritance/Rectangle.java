package inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    protected double sides = 4;

    // Methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I'm a rectangle");
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

    // Sides getter and setter
    public double getSides(){
        return length;
    }

    public void setSides(double length){
        this.length = length;
    }
}
