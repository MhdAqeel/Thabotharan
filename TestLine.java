public class TestLine {
    public static void main (String [] args){
        
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5 , 6);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(5, 4, 6, 7);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println();
        System.out.printf("The length of line is : %.2f\n",l1.getLength());
        System.out.printf("The length of line is : %.2f\n",l2.getLength());
        System.out.println();

        System.out.println("The begin point of the line1 : "+l1.getBegin().toString());
        System.out.println("The end point of the line1   : "+l1.getEnd().toString());
        System.out.println("The X cordinate of Begin     : "+l1.getBeginX());
        System.out.println("The Y cordinate of Begin     : "+l1.getBeginY());
        System.out.println("The X cordinate of End       : "+l1.getEndX());
        System.out.println("The Y cordinate of End       : "+l1.getEndY());
        int [] arr1 = l1.getBeginXY();
		System.out.println("Begin of Line1               = ("+arr1[0]+","+arr1[1]+")");
        int [] arr2 = l1.getEndXY();
		System.out.println("End of Line1                 = ("+arr2[0]+","+arr2[1]+")");
    }
}
