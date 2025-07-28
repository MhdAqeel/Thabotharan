public class testCircleup{
	public static void main (String [] args){
		Point p1 = new Point(2,3);
		Circleup c1 = new Circleup ();
		Circleup c2 = new Circleup(2.0,"yellow",9,10);
		Circleup myCircle = new Circleup (5.0,"purple",p1);
		
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(myCircle.toString());
		System.out.println();

		c1.setColour("green");
		System.out.println(c1.toString());
		System.out.println();
	}
}