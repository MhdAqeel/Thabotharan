public class Fan extends Device {
	private int speed;
	
	public Fan(String name , int speed){
		super(name);
		this.speed = speed;
	}
	public int getSpeed(){
		return this.speed;
	}
	
	@Override
	public void performFunction(){
		System.out.println(getName() + " is spinnig at "+ getSpeed()+ " speed");
	}
}