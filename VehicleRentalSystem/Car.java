public class Car extends Vehicle {
    private boolean luxury;

    public Car(String brand, String model, int baseRate, boolean luxury) {
        super(brand, model, baseRate);
        this.luxury = luxury;
    }
    
}