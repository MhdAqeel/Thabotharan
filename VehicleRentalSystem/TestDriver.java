public class TestDriver {
    public static void main(String[] args) {
        // Create some vehicles
        Car car1 = new Car("Toyota", "Camry", 50, false);
        Car car2 = new Car("BMW", "X5", 100, true);
        Motorbike bike1 = new Motorbike("Yamaha", "YZF-R3", 30, 321);
        Motorbike bike2 = new Motorbike("Ducati", "Panigale V4", 80, 1103);

        // Create a customer
        Customer customer = new Customer("John Doe", "D1234567");

        // Display vehicle descriptions and rental costs
        System.out.println(car1.getDescription());
        System.out.println("Rental cost for 3 days: $" + car1.calculateRent(3));

        System.out.println(car2.getDescription());
        System.out.println("Rental cost for 3 days: $" + car2.calculateRent(3));

        System.out.println(bike1.getDescription());
        System.out.println("Rental cost for 3 days: $" + bike1.calculateRent(3));

        System.out.println(bike2.getDescription());
        System.out.println("Rental cost for 3 days: $" + bike2.calculateRent(3));
    }
}
