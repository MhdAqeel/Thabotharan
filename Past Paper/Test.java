public class Test{
	public static void main (String [] args){
		Student s1 = new Student ("Aqeel");
		Student s2 = new Student ("Jasool");
		
		Corse maths = new Corse("Maths");
		Corse science = new Corse("Science");
		Corse english = new Corse("English");
		Corse history = new Corse("History");
		Corse geography = new Corse("Geography");
		
		s1.assignCorse(maths);
		s1.assignCorse(science);
		s1.assignCorse(english);
		
		s2.assignCorse(english);
		s2.assignCorse(history);
		
		s1.studentDetails();
		s2.studentDetails();
		
	}
}