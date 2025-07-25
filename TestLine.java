public class TestLine {
    public static void main (String [] args){
        
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5 , 6);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(5, 4, 6, 7);
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.printf("The length of line is : %.2f\n",l1.getLength());
        System.out.printf("The length of line is : %.2f\n",l2.getLength());
    }
}
