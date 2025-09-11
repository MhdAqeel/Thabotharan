public class Motorbike extends Vehicle {
    private int engineCC;

    public Motorbike(String brand, String model, int baseRate, int engineCC) {
        super(brand, model, baseRate);
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public double calculateRent(int days) {
        double finalRent = days * getBaseRate();
        if (engineCC > 500) {
            finalRent *= 1.15; // add 15% for bikes with engineCC > 500
        }
        return finalRent;
    }
}
