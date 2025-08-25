public class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getArea() {
        return 0.0;
    }
    
    public String toString() {
        return "Color = " + this.getColor() + "\nArea = " + this.getArea();
    }
}