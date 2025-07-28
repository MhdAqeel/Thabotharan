public class TestCylinder{
	public static void main (String [] args){
		Circle top = new Circle(5.7,"green");
		Circle bottom = new Circle(5.7,"yellow");
		Cylinder myc = new Cylinder(top,10,bottom);
		Cylinder c1 = new Cylinder();
		
		System.out.println("=======MY CYLINDER======== \n"+myc.toString());
		System.out.println("=======MY CYLINDER======== \n"+c1.toString());
	}
}