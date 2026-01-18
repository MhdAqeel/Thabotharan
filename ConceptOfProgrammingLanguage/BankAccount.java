public class BankAccount;

private int AccountId;
private String AccountHolderName;
private enum CustomerType {personal ,group, company};
protected int intrestRate;
private int Annualcharges; //= personal/group 1000 , company 5000
private double balance; 


public double Deposit(double deposit){
	this.balance = deposit;
	return balance;
}

public double Withdraw(double withdraw){
	if (withdraw <= this.balance){
		balance = balance - withdraw;
	}
	else{
		System.out.println("LOW ACCOUNT BALNCE !!!!!!");
	}
	
	return balance;
}

public double transfer(int resiverId , double amount){
	
}
