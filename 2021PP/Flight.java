public class Flight{
	private String flightNumber;
	private String destination;
	private boolean booked = false;
	private int capacity;
	private int seatsLeft;
	private double basePrice;
	
	public Flight(String flightNumber, String destination, int capacity , double basePrice){
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.capacity = capacity;
		this.seatsLeft = capacity;
		this.basePrice = basePrice;
	}
	
	public String getFlightNumber(){
		return this.flightNumber;
	}
	
	public String getDestination(){
		return this.destination;
	}
	
	public boolean isBooked(){
		if (booked){
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getCapacity(){
		return this.capacity;
	}
	
	public int getSeatLeft(){
		return this.seatsLeft;
	}
	
	public double calculateTotalPrice(int numSeats){
		if (numSeats > this.numSeats){
			return 0.0;
		}
		else{
			return numSeats*this.basePrice;
		}
	}
	
	public void book(int numSeats){
		if (numSeats>seatsLeft || booked){
			System.out.println("Sorry !!! only "+ this.seatsLeft+ " sheets are available");
		}
		else{
			seatsLeft = seatsLeft - numSeats;
			if (seatsLeft == 0){
				this.book = true;
			}
		}
	}
	
	public void cancelBooking(int numSeats){
		int numBooked = this.capacity - this.seatsLeft;
		if (numSeats > numBooked){
			System.out.println("Can't do only "+numBooked + Sheets are booked);
		}
		else{
			seatsLeft = seatsLeft + numSeats;
			if (booked){
				booked = false;
			}
		}
	}
}