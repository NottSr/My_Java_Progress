package inheritance.bakery;

public class WeddingCake extends Cake {

    private int tiers;

    // Default constructor
    public WeddingCake(){
        super("Almond");
    }

    // Tiers getter and setter
    public int getTiers(){
        return tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
}
