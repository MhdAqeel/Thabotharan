public class Test{
	public static void main (String [] args){
		ClassicCar mustang = new ClassicCar("Mustang", "Ford" ,1965);
		ClassicCar benz = new ClassicCar("AMG Gt", "Merzdis" ,1975);
		ClassicCar bmw = new ClassicCar("M1", "BMW" ,1955);
		SportsCar lambo = new SportsCar("Aventerdor", "Lamborgini" , 2005, 1000.0);
		SportsCar bugatti = new SportsCar("Chiron", "Bugatti" , 2000, 2000.0);
		SportsCar gtr = new SportsCar("GTR", "Nissan" , 1986, 1000.0);
		
		CarExhibition ex1 = new CarExhibition();
		
		ex1.addCars(mustang);
		ex1.addCars(benz);
		ex1.addCars(bmw);
		ex1.addCars(lambo);
		ex1.addCars(bugatti);
		ex1.addCars(gtr);
		
		ex1.getTotalPrice();
	}
}