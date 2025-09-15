public class Test{
	public static void main (String [] args){
		Room livingRoom = new Room();
		Light l1 = new Light("focus light" , 500);
		Light l2 = new Light("dim light" , 410);
		Light l3 = new Light("blue light" , 250);
		Fan f1 = new Fan("ceeling fan" , 3);
		Fan f2 = new Fan("table fan" , 4);
		
		livingRoom.addDevice(l1);
		livingRoom.addDevice(l2);
		livingRoom.addDevice(l3);
		livingRoom.addDevice(f1);
		livingRoom.addDevice(f2);

		livingRoom.activateAll();
	}
} 