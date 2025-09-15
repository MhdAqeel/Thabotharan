import java.util.ArrayList;
import java.util.List;
public class Room {
	private List <Device> devices = new ArrayList<>();
	 
	public void addDevice (Device d){
		devices.add(d);
	}
	
	public void showAllDevice(){
		for (int i = 0; i < devices.size(); i++) {
			(devices.get(i)).performFunction();
		}
	}
	
	public void activateAll(){
		for (int i = 0; i < devices.size(); i++) {
			(devices.get(i)).turnOn();
		}
		for (int j = 0; j < devices.size(); j++) {
			(devices.get(j)).performFunction();
		}
	}
}