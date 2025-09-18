public class Test {
	public static void main (String [] args){
		//test for credit card 
		CreditCardPayment mastercard = new CreditCardPayment(5000.0);
		System.out.println("Available balnce is : "+mastercard.getBalence());
		mastercard.pay(1000.0);
		System.out.println("Available balnce is : "+mastercard.getBalence());
		
		
		System.out.println();
		// test for cash
		CashPayment cash = new CashPayment();
		System.out.println("Available balnce is : "+cash.getBalence());
		cash.pay(2500.0);
		System.out.println("Available balnce is : "+cash.getBalence());
		
	}
}