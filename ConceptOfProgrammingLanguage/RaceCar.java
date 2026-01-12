public class RaceCar extends Vehicle{
    public RaceCar(String engineID,String brandName,double fuelLevel){
        super(engineID,brandName,fuelLevel);
    }

    public void activateTurbo(){
        if (fuelLevel>70){
            System.out.println("Turbo activated");
        }
        else{
            System.out.println("Fuel low");
        }
    }

    public void refuel(){
        super.injectFuel();
    }
}