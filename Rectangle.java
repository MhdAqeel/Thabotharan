public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
    
    public String toString() {
        return super.toString();
    }
}