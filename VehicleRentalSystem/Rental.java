public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public Rental(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRent(rentalDays);
    }

    public String getRentalDetails() {
        return "Customer: " + customer.getName() + "\n" +
               "Vehicle: " + vehicle.getDescription() + "\n" +
               "Rental Days: " + rentalDays + "\n" +
               "Total Cost: $" + calculateTotalCost();
    }

    public void printInvoice(){
        System.out.println(getRentalDetails());
    }
}
