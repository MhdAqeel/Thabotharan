public class TestCylinder{
	public static void main (String [] args){
		Cylinder myc = new Cylinder();
		Cylinder c1 = new Cylinder(20.0,7.0,"blue");
		
		System.out.println("=======MY CYLINDER======== \n"+myc.toString());
		System.out.println();
		System.out.println();
		System.out.println("=======MY CYLINDER======== \n"+c1.toString());
	}
}