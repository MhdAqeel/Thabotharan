public class TestMonsters{
	public static void main (String [] args){
		
		//test fire monster class
		FireMonster f1 = new FireMonster("Salamander");
		System.out.println();
		System.out.println(f1.attack());
		System.out.println();
		
		//test water monster
		WaterMonster w1 = new WaterMonster("Kraken");
		System.out.println(w1.attack());
		System.out.println();
		
		//test stone monster
		StoneMonster s1 = new StoneMonster("Golem");
		System.out.println(s1.attack());
		System.out.println();
		
	}
}