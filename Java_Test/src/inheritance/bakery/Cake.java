package inheritance.bakery;

public class Cake {
    
    // Cake attributes
    protected String flavor;
    protected double price;

    // Default constructor
    public Cake(){
        this("Vanilla");
    }

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }

    // Flavor getter and setter
    public String getFlavor(){
        return flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    // Price getter and setter
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
