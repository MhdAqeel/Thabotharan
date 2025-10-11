import java.util.*;
public class Student{
	private final ArrayList <Corse> corses = new ArrayList <>();
	private final String name ;
	
	public Student(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	public void assignCorse(Corse corse){
		int lengthOfArray = corses.size();
		if (lengthOfArray < 2){
			this.corses.add(corse);
		}
		else{
			System.out.println("The Student AllRedy Chosen Two Corses");
		}
	}
	
	public void studentDetails(){
		System.out.println("Name : " + this.name +
		"\n corses : " + corses );
	}
}