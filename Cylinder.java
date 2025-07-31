public class Cylinder extends Circle{
	private Circle top;
	private double height;
	private Circle bottom;

	public final double DEFULT_HEIGHT = 20.0;
	
	public Cylinder(Circle top,double height, Circle bottom){
		this.top=top;
		this.height=height;
		this.bottom = bottom;
	}
	public Cylinder(){
		this.top = new Circle();
		this.height = DEFULT_HEIGHT;
		this.bottom = new Circle();
	}
	public Cylinder(double height, double radius){
		this.top = new Circle (radius);
		this.height = height;
		this.bottom = new Circle (radius);
	}
	public Cylinder(double height, double radius, String color){
		this.top = new Circle (radius, color);
		this.height = height;
		this.bottom = new Circle (radius , color);
	}
	
	public Circle getTop(){
		return this.top;
	}
	public Circle getBottom(){
		return this.bottom;
	}
	public double getHeight(){
		return this.height;
	}
	
	public double getVolume(){
		return Math.PI*top.getRadius()*top.getRadius()*getHeight();
	}
	
	public String toString(){
		return "  The Top of the cylinder is : \n"+this.top.toString()+"\n  THe Bottom of the cylinder is : \n"+this.bottom.toString()+"\nThe Height of the Cylinder is : "+this.getHeight()+"\n the volume of th ecylinder is : "+this.getVolume();
	}
}