public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Distance from p1 to origin: " + p1.distance());
        System.out.println("Distance from p1 to (7, 1): " + p1.distance(7, 1));
        System.out.println("Distance from p1 to p2    : " + p1.distance(p2));
		System.out.println();
		int [] arr = p1.getXY();
		System.out.println("point 1 = ("+arr[0]+","+arr[1]+")");
		int [] arrp2 = p2.getXY();
		System.out.println("point 2 = ("+arrp2[0]+","+arrp2[1]+")");
    }
}
