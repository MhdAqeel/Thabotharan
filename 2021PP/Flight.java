public class Flight {
    private String flightNumber;
    private String destination;
    private boolean booked = false;
    private int capacity;
    private int seatsLeft;
    private double basePrice;

    public Flight(String flightNumber, String destination, int capacity, double basePrice) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.seatsLeft = capacity;
        this.basePrice = basePrice;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public boolean isBooked() {
        return booked;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSeatsLeft() {
        return this.seatsLeft;
    }

    public double calculateTotalPrice(int numSeats) {
        if (numSeats > this.seatsLeft) {
            System.out.println("Not enough seats available!");
            return 0.0;
        } else {
            return numSeats * this.basePrice;
        }
    }

    public void book(int numSeats) {
        if (numSeats > seatsLeft || booked) {
            System.out.println("Sorry! Only " + this.seatsLeft + " seats are available.");
        } else {
            seatsLeft -= numSeats;
            if (seatsLeft == 0) {
                this.booked = true;
            }
            System.out.println(numSeats + " seat(s) booked successfully!");
        }
    }

    public void cancelBooking(int numSeats) {
        int numBooked = this.capacity - this.seatsLeft;
        if (numSeats > numBooked) {
            System.out.println("Can't cancel " + numSeats + " seats. Only " + numBooked + " seats are booked.");
        } else {
            seatsLeft += numSeats;
            if (booked && seatsLeft > 0) {
                booked = false;
            }
            System.out.println(numSeats + " seat(s) cancelled successfully!");
        }
    }
}
