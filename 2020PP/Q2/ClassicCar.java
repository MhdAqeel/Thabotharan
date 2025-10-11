public class ClassicCar extends Car{
	private final double price =100000.00;

	public ClassicCar (String name, String brand, int yearOfManufacture){
		super(name , brand , yearOfManufacture);
	}
	
	@Override
	public double calculateSalePrice(){
		return price;
	}
}