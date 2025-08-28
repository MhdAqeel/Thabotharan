public class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }

    public Shape(){
        this.color="White";
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getArea() {
        System.out.println("Aw snap! my Area is not defined");
        return 0.0;
    }
    
    public String toString() {
        return "Color = " + this.getColor() + "\nArea = " + this.getArea();
    }
}