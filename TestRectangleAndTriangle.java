public class TestRectangleAndTriangle {
    public static void main(String[] args) {
        //test shape
        Shape s1 = new Shape("red");
        System.out.println(s1);
		System.out.println();
		
		// test rectangle
        Rectangle zi = new Rectangle("blue", 10, 5);
        System.out.println(zi);
        System.out.println();
       
		// test triangle
        Triangle ti = new Triangle("green", 15, 5);
        System.out.println(ti);
		System.out.println();
        
		//test Shape1 
		//Shape1 s2 = new Shape1("blue");
		//System.out.println("s2");


    }
}