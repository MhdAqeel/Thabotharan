public class Test {
    public static void main (String [] args){
        //test circle
        Circle c1 = new Circle ();
		Circle c2 = new Circle(2.0);
		Circle myCircle = new Circle(3.97,"Green");
		
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(myCircle.toString());
		System.out.println();

		c1.setColor("green");
		System.out.println(c1.toString());
		System.out.println();

        //test cylinder
        Cylinder myc = new Cylinder();
		Cylinder myc1 = new Cylinder(20.0,7.0,"blue");
		
		System.out.println("=======MY CYLINDER======== \n"+myc.toString());
		System.out.println();
		System.out.println();
		System.out.println("=======MY CYLINDER======== \n"+myc1.toString());
    }    
}
