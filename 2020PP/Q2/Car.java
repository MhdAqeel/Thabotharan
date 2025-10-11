public abstract class Car{
	private String name;
	private String brand;
	int yearOfManufacture;
	
	public Car (String name, String brand, int yearOfManufacture){
		this.name = name;
		this.brand = brand;
		this.yearOfManufacture =yearOfManufacture;
	}
	
	public abstract double calculateSalePrice();
}