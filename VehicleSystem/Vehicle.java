public abstract class Vehicle{
    String brand ;
    int speed ;

    public Vehicle (String brand , int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public abstract void move(); 
}