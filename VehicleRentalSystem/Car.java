public class Car extends Vehicle {
    private boolean luxury;

    public Car(String brand, String model, int baseRate, boolean luxury) {
        super(brand, model, baseRate);
        this.luxury = luxury;
    }
    
    public boolean isLuxury(){
        return luxury;
    }

    public double calculateRent(int days){
        //rent formula days*baserate + (if luxury add 20% )
        double finalRent = days * getBaseRate();
        if(isLuxury()){
            finalRent *= 1.2;
        }
        return finalRent;
    }
}