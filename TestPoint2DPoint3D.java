public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        System.out.println();
        
        // test Point2D
        Point2D p2a = new Point2D(1, 2);
        System.out.println(p2a);
        
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        
        System.out.println("X is " + p2a.getX());
        System.out.println("Y is " + p2a.getY());
        
        System.out.println();
        System.out.println();
        
        // test Point3D
        Point3D p3a = new Point3D(11, 12, 13);
        System.out.println(p3a);
        
        Point3D p3b = new Point3D();
        System.out.println(p3b);
        
        p3a.setX(14);
        p3a.setY(15);
        p3a.setZ(16);
        System.out.println(p3a);
        
        System.out.println("X is " + p3a.getX());
        System.out.println("Y is " + p3a.getY());
        System.out.println("Z is " + p3a.getZ());
    }
}