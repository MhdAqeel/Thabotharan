public class CashPayment implements Payment{
		private double balence;
		
		public CashPayment(double balence){
			this.balence = balence;
		}
		
		public CashPayment(){
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