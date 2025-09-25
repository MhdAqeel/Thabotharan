public class Bike extends Vehicle{
    public Bike(String brand , int speed){
        super(brand , speed);
    }
    @Override 
    public void move (){
        System.out.println(brand + " Bike is going at " + speed + "Km/h");
    }
}