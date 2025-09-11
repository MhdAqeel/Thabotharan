public abstract class Vehicle {
    private String brand;
    private String model;
    private int baseRate;

    public Vehicle(String brand,String model,int baseRate){
        this.brand = brand;
        this.model =model;
        this.baseRate = baseRate;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getBaseRate() {
        return baseRate;
    }
    
    public String getDescription() {
        return brand + " " + model + " with a base rate of $" + baseRate + " per day.";
    }

    public abstract double calculateRent(int days);
    
        
}