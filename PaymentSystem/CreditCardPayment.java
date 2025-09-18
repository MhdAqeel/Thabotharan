public class CreditCardPayment implements Payment{
		private double balence;
		
		public CreditCardPayment(double balence){
			this.balence = balence;
		}
		
		public CreditCardPayment(){
			this.balence = 0.0;
		}
		public double getBalence(){
			return this.balence;
		}
		public double pay (double amount){
			balence = balence +amount;
			return balence;
		}
}