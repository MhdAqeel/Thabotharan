public class TestInvoice{
	public static void main (String [] args){
		Customer c1 = new Customer (001 , "Aqeel" , 10);
		Invoice i1 = new Invoice (100 , c1 , 1000.0);
		
		System.out.println(i1.toString());
	}
}