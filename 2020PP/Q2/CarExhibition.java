import java.util.*;
public class CarExhibition{
	private ArrayList <Car> cars = new ArrayList <>();

	public void addCars (Car car){
		cars.add(car);
	} 
	
	public void getTotalPrice (){
		int arrayLen = cars.size();
		double sum = 0;
		for(int i = 0 ; i<arrayLen ; i++){
			sum = cars.get(i).calculateSalePrice()+sum;
		}
		System.out.println("The total price of the cars in the exepition are : " + sum );
	}
}