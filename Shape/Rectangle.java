public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(){
        length=1;
        width=0;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
    
    @Override
    public String toString() {
        return "Rectangle [length = " +length +" , width = " + width + "]"+
        "\nArea = " + getArea();
    }
}