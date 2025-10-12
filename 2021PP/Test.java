public class Test {
    public static void main(String[] args) {

        // Create a new flight
        Flight flight1 = new Flight("AI202", "New York", 10, 250.0);

        System.out.println("=== Flight Information ===");
        System.out.println("Flight Number: " + flight1.getFlightNumber());
        System.out.println("Destination: " + flight1.getDestination());
        System.out.println("Capacity: " + flight1.getCapacity());
        System.out.println("Seats Left: " + flight1.getSeatsLeft());
        System.out.println("Booked (Full)? " + flight1.isBooked());
        System.out.println();

        // Test: Calculate total price
        System.out.println("=== Price Calculation Test ===");
        int seatsToBook = 3;
        double totalPrice = flight1.calculateTotalPrice(seatsToBook);
        System.out.println("Total price for " + seatsToBook + " seats: $" + totalPrice);
        System.out.println();

        // Test: Booking seats
        System.out.println("=== Booking Test ===");
        flight1.book(3);  // book 3 seats
        System.out.println("Seats left after booking: " + flight1.getSeatsLeft());
        System.out.println("Booked (Full)? " + flight1.isBooked());
        System.out.println();

        // Test: Overbooking (should show an error message)
        System.out.println("=== Overbooking Test ===");
        flight1.book(20);  // trying to overbook
        System.out.println("Seats left after attempt: " + flight1.getSeatsLeft());
        System.out.println();

        // Test: Booking remaining seats
        System.out.println("=== Full Booking Test ===");
        flight1.book(7); // book all remaining seats
        System.out.println("Seats left after booking all: " + flight1.getSeatsLeft());
        System.out.println("Booked (Full)? " + flight1.isBooked());
        System.out.println();

        // Test: Canceling booking
        System.out.println("=== Cancellation Test ===");
        flight1.cancelBooking(2);
        System.out.println("Seats left after cancellation: " + flight1.getSeatsLeft());
        System.out.println("Booked (Full)? " + flight1.isBooked());
        System.out.println();

        // Test: Cancel more than booked (should show error)
        System.out.println("=== Invalid Cancellation Test ===");
        flight1.cancelBooking(20);
        System.out.println("Seats left after invalid cancel: " + flight1.getSeatsLeft());
        System.out.println();

        System.out.println("=== Final Flight Status ===");
        System.out.println("Flight Number: " + flight1.getFlightNumber());
        System.out.println("Destination: " + flight1.getDestination());
        System.out.println("Seats Left: " + flight1.getSeatsLeft());
        System.out.println("Booked (Full)? " + flight1.isBooked());
    }
}