public class Car extends Vehicle{
    public Car(String brand , int speed){
        super(brand , speed);
    }

    @Override 
    public void move (){
        System.out.println(brand + " car is going at " + speed + "Km/h");
    }
}