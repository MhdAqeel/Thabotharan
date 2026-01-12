public class Vehicle{
    private String engineID;
    public String brandName;
    protected double fuelLevel;

    public Vehicle(String engineID,String brandName,double fuelLevel){
        this.engineID=engineID;
        this.brandName=brandName;
        this.fuelLevel=fuelLevel;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    protected void injectFuel(){
       System.out.println("Injecting fuel");
    }
}