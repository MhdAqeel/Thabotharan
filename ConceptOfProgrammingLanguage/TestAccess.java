public class TestAccess{
    public static void main (String [] args){
        RaceCar c1 = new RaceCar("aqeel007","BMW",50.0);
        RaceCar c2 = new RaceCar("rikas009","Lambo",80.0);

        c1.activateTurbo();
        c2.activateTurbo();
        c1.refuel();
    }
}