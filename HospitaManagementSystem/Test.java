public class Test {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("House", 35, 00006,"Brain surgen");
        Patient p1 = new Patient("Nandhasena", 80, 001);

        d1.dispalyInfo();
        p1.dispalyInfo();

        p1.generateBill(3500);
    }
}
