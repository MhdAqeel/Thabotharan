public class TestCircle{
	public static void main (String [] args){
		Circle c1 = new Circle ();
		Circle c2 = new Circle(2.0);
		Circle myCircle = new Circle(3.97,"Green");
		System.out.println("The radius of c1 circle is :"+c1.getRadius());
		System.out.println("colour of my circle is "+c1.getColour());
		System.out.println("The radius of c1 circle is :"+c2.getRadius());
		System.out.println("colour of my circle is "+c2.getColour());
		System.out.println("The radius of c1 circle is :"+myCircle.getRadius());
		System.out.println("colour of my circle is "+myCircle.getColour());
	}
}