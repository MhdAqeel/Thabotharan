public class Light extends Device{
	private int brightness;
	
	public Light (String name , int brightness){
		super(name);
		this.brightness = brightness ;
	}
	
	public int getBrighness (){
		return this.brightness;
	}
	
	@Override
	public void performFunction(){
	
		System.out.println(getName() + " is shining at "+ getBrighness()+ " brightness");
	}
}