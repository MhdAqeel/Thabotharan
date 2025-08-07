public class Invoice extends Customer{
	private int id;
	//private Customer customer;
	private double amount;
	
	public Invoice(int cid , String name,int discount,int id, double amount){
		super(cid , name , discount);
		this.id = id;
		//this.customer = customer;
		this.amount = amount;
	}
	public int getId(){
		return this.id;
	}
	/*public Customer getCustomer(){
		return this.customer;
	}
	public void setCustomer(Customer customer){
		this.customer = customer;
	}*/
	public double getAmount(){
		return this.amount;
	}
	public void setAmount(double amount){
		this.amount = amount;
	}
	public int getCustomerId(){
		return super.getId();
	}
	public String getCustomerName(){
		return super.getName();
	}
	public int getCustomerDiscount(){
		return super.getDiscount();
	}
	public double getAmountAfterDiscount(){
		double dis = (this.amount /100)*getCustomerDiscount();
		return (this.amount-dis);
	}
	public String toString(){
	return "Invoice [ id = "+this.getId()+", customer = "+super.toString()+", amount = "+getAmountAfterDiscount()+" ]";
	}
}