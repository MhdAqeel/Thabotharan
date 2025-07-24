public class TestCircle{
	public static void main (String [] args){
		Circle c1 = new Circle ();
		Circle c2 = new Circle(2.0);
		Circle myCircle = new Circle(3.97,"Green");
		
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