public class SportsCar extends Car{
	private double price ;
	
	public SportsCar(String name, String brand, int yearOfManufacture , double price){
		super(name , brand , yearOfManufacture);
		this.price = price;
	}
	
	@Override
	public double calculateSalePrice(){
		if(this.yearOfManufacture>2000){
			return 0.75*price;
		}
		else if(this.yearOfManufacture > 1995 && this.yearOfManufacture <= 2000 ){
			return 0.5*price;
		}
		else{
			return 0.25*price;
		}
	}
}