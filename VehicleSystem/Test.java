public class Test{
    public static void main (String [] args){
        Car c1 = new Car("BMW" , 200);
        Bike b1 = new Bike("Ducati" , 250);

        c1.move();
        b1.move();
    }
}