public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle() {
        this.base = 10;
        this.height = 15;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    
    @Override
    public String toString() {
        return "Triangle [base = " +base +" , height = " + height + "]"+
        "\nArea = " + getArea();
    }
}