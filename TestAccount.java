public class TestAccount{
	public static void main (String [] ars){
		Account a1 = new Account (111 , "aqeel" , 'm' , 10101 , 5000.0);
		Account a2 = new Account (222 , "Nayanthara" , 'f' , 15214 );
		
		System.out.println();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		System.out.println();
		a1.withraw(1000.0);
		System.out.println(a1.toString());
		
		System.out.println();
		a2.withraw(1000.0);
		System.out.println(a2.toString());
		
		System.out.println();
		a2.deposit(1000.0);
		System.out.println(a2.toString());
	}
}