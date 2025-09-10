public class Pastry extends Product {
    private boolean glutenFree;
    private boolean warmed;

    public Pastry(String name, double basePrice, boolean glutenFree, boolean warmed) {
        super(name, basePrice);
        this.glutenFree = glutenFree;
        this.warmed = warmed;
    }

    public Pastry(boolean glutenFree, boolean warmed){
        
        this.glutenFree= glutenFree;
        this.warmed = warmed ;
    }

    @Override
    public double price() {
        double finalPrice = super.getBasePrice();
        finalPrice += (this.glutenFree ? 0.50 : 0.0);
        finalPrice += (this.warmed ? 0.20 : 0.0);
        return finalPrice;
    }

    @Override
    public String prepNote (boolean glutenFree , boolean warmed) {
        
    }

    @Override
    public String toString() {
        return "Name - " + super.getName() + "\nPrice = " + this.price();
    }
}