public abstract Shape1{
    private String color;

    public Shape1(String color){
        this.color=color;
    }

    public abstract double getArea(){
        System.out.println("Aw snap! my Area is not defined");
        return 0.0;
    }

    public abstract double getPerimeter(){
        return 0.0;
    }
    
    public String toString() {
        return "Color = " + this.getColor() + "\nArea = " + this.getArea();
    } 
}