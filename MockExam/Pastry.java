public class Pastry extends Product {
    private boolean glutenFree;
    private boolean warmed;

    public Pastry(String name, double basePrice, boolean glutenFree, boolean warmed) {
        super(name, basePrice);
        this.glutenFree = glutenFree;
        this.warmed = warmed;
    }

    // public Pastry(boolean glutenFree, boolean warmed){
        
    //     this.glutenFree= glutenFree;
    //     this.warmed = warmed ;
    // }

    @Override
    public double price() {
        double finalPrice = super.getBasePrice();
        finalPrice += (this.glutenFree ? 0.50 : 0.0);
        finalPrice += (this.warmed ? 0.20 : 0.0);
        return finalPrice;
    }

    @Override
    public String prepNote () {
        return String.format("%s - %s , %s", 
                getName(),
                glutenFree ? "gluten-free" : "regular",
                warmed? "warm slightly" : "no warming ");
    }

    @Override
    public String toString() {
        return String.format("Name = %s\nPrice = %.2f", getName(), price());
}
}