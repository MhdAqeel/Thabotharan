import java.util.*;

public class Test{
    public static void main (String [] args){
        Shape [] shapes = {new Circle() , new Rectangle()};
        
        ((Colorable) shapes[0]).setColor("red");
        ((Colorable) shapes[1]).setColor("blue");

        for (Shape s : shapes){
            s.draw();
        }
    }
}