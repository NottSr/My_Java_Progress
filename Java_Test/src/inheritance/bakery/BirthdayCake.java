package inheritance.bakery;

public class BirthdayCake extends Cake {
    
    private int candles;

    // Default constructor
    public BirthdayCake(){
        super("Chocolate");
    }

    // Candles getter and setter
    public int getCandles(){
        return candles;
    }

    public void setCandles(int candles){
        this.candles = candles;
    }
}
