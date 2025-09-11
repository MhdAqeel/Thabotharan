public abstract class Product {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return this.name;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public abstract double price();
    public abstract String prepNote();

    public String toString() {
        return String.format("Name = %s\nPrice = %.2f", getName(), price());
}
}