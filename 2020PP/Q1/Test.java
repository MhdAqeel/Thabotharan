public class Test {
	public static void main (String [] args){
		ISBN num1 = new ISBN ("0 941831 39 6");
		Book b1 = new Book ("java", "aqeel", "atlas", "chilaw", "30thNovember2025",2000.0,num1);
		
		System.out.println(b1.toString());
	}
}