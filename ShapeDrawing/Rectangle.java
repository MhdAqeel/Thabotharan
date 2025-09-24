public class Rectangle extends Shape implements Colorable{
    @Override 
    public void draw () {
        System.out.println("Drawing a "+color+" rectangle.");
    }
    
    @Override
    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }
}