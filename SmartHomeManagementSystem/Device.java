public abstract class Device implements Controllable{
	private String name;
	private boolean isOn;
	
	public Device(String name){
		this.name = name ;
		this.isOn=false;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public void turnOn(){
		this.isOn=true;
	}
	
	@Override
	public void turnOff(){
		this.isOn = false;
	}
	
	@Override
	public String getStatus(){
		return (isOn? "DEvice is working" : "Device is not working");
	}
	
	public abstract void performFunction();
}