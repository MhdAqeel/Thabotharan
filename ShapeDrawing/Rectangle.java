public class Rectangle extends Shape implements Colorable{
    @Override 
    public void draw () {
        System.out.println("this is a rectangle.");
    }
    
    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }
}