public class Cylinder{
	private Circle top;
	private int height;
	private Circle bottom;

	public final int DEFULT_HEIGHT = 20;
	
	public Cylinder(Circle top,int height, Circle bottom){
		this.top=top;
		this.height=height;
		this.bottom = bottom;
	}
	public Cylinder(){
		this.top = new Circle();
		this.height = DEFULT_HEIGHT;
		this.bottom = new Circle();
	}
	
	public Circle getTop(){
		return this.top;
	}
	public Circle getBottom(){
		return this.bottom;
	}
	public int getHeight(){
		return this.height;
	}
	
	public double getVolume(){
		return Math.PI*top.getRadius()*top.getRadius()*getHeight();
	}
	
	public String toString(){
		return "  The Top of the cylinder is : \n"+this.top.toString()+"\n  THe Bottom of the cylinder is : \n"+this.bottom.toString()+"\nThe Height of the Cylinder is : "+this.getHeight()+"\n the volume of th ecylinder is : "+this.getVolume();
	}
}