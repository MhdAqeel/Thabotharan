// Beverage.java
public class Beverage extends Product {
    private Size size;
    private boolean iced;

    public Beverage(String name, double basePrice, Size size, boolean iced) {
        super(name, basePrice);
        this.size = size;
        this.iced = iced;
    }

    @Override
    public double price() {
        double sizeMultiplier = 0.0;
        switch(size) {
            case SMALL:
                sizeMultiplier = 1.0;
                break;
            case MEDIUM:
                sizeMultiplier = 1.25;
                break;
            case LARGE:
                sizeMultiplier = 1.5;
                break;
        }
        
        double finalPrice = super.getBasePrice() * sizeMultiplier;
        if (iced) {
            finalPrice += 0.30;
        }
        return finalPrice;
    }

    @Override
    public String prepNote() {
        return
    }
}