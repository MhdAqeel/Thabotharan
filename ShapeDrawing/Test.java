import java.util.*;

public class Test{
    public static void main (String [] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Rectangle r1 = new Rectangle();

        List <Circle> circles = new ArrayList <> ();
        circles.add(c1);
        circles.add(c2);

        c1.setColor("blue");
        c2.setColor("white");
        r1.setColor("green");

        // c1.draw();
        // r1.draw();

        circles.get(0).draw();
        circles.get(0).draw();        
        System.out.println(c1.getColor());
        System.out.println(r1.getColor());
    }
}