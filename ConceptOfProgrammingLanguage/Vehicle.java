package ConceptOfProgrammingLanguage;

// Parent class: Vehicle
public class Vehicle {

    // A unique engine ID, completely hidden from all classes
    private String engineID;

    // Brand name accessible to everyone
    public String brandName;

    // Fuel level, hidden from the general public but visible to subclasses
    protected double fuelLevel;

    // Constructor to initialize the Vehicle attributes
    public Vehicle(String engineID, String brandName, double fuelLevel) {
        this.engineID = engineID;
        this.brandName = brandName;
        this.fuelLevel = fuelLevel;
    }

    // Method visible to everyone
    public void startEngine() {
        System.out.println("Engine started.");
    }

    // Method visible only to subclasses
    protected void injectFuel() {
        System.out.println("Injecting fuel.");
    }
}