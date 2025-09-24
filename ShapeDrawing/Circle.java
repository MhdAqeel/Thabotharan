public class Circle extends Shape implements Colorable{
    @Override 
    public void draw () {
        System.out.println("this is a circle.");
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }
}