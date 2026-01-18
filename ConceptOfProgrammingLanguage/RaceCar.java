package ConceptOfProgrammingLanguage;

// Subclass extending Vehicle
public class RaceCar extends Vehicle {

    // Constructor invoking the superclass constructor
    public RaceCar(String engineID, String brandName, double fuelLevel) {
        super(engineID, brandName, fuelLevel);
    }

    // Method to activate turbo 
    public void activateTurbo() {
        if (brandName.equals("BMW") && fuelLevel > 70) {
            System.out.println("Turbo activated");
        } else {
            System.out.println("Fuel low");
        }
    }

    // Method to refuel and call injectFuel method
    public void refuel() {
        this.injectFuel();
        System.out.println("Refueling done.");
    }
}