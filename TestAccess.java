// TestAccess.java content for testing Vehicle and RaceCar classes

public class TestAccess {
    public static void main(String[] args) {
        // Placeholder content for testing
        Vehicle vehicle = new Vehicle();
        RaceCar raceCar = new RaceCar();
        
        // Test Vehicle class
        vehicle.startEngine();
        System.out.println("Vehicle speed: " + vehicle.getSpeed());

        // Test RaceCar class
        raceCar.startRaceMode();
        System.out.println("RaceCar turbo boost: " + raceCar.getTurboBoost());
        
        System.out.println("Test successful!\nAll methods invoked correctly.");
    }
}