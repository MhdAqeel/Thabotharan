public class BankAccount{
	private String AccountId;
	private String AccountHolderName;
	private CustomerType customerType;
	protected double intrestRate;
	private double annualCharges; //= personal/group 1000 , company 5000
	private double balance; 

	public BankAccount(String accountId , String AccountHolderName , CustomerType customerType , double balance){
		this.AccountId = accountId;
		this.AccountHolderName = AccountHolderName;
		this.customerType = customerType;
		this.balance = balance;
		if (customerType == CustomerType.PERSONAL || customerType == CustomerType.GROUP) {
            this.annualCharges = 1000.00;
        } else if (customerType == CustomerType.COMPANY) {
            this.annualCharges = 5000.00;
        }
	}

	public void deposit(double amount){
		balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println("New balance: " + balance);
	}

	public void withdraw(double amount){
		if (amount <= this.balance){
			balance -= amount;
		System.out.println("Successfully withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
		}
		else{
			System.out.println("LOW ACCOUNT BALNCE !!!!!!");
		}
	}

	public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account ID: " + targetAccount.accountID);
        } else {
            System.out.println("Transfer failed: Insufficient balance or invalid amount.");
        }
    }

	public double getBalance() {
        return balance;
    }

    public String getAccountID() {
        return AccountId;
    }

    protected String getAccountHolderName() {
        return AccountHolderName;
    }

    protected CustomerType getCustomerType() {
        return customerType;
    }

    public double getAnnualCharges() {
        return annualCharges;
    }

    abstract void calculateInterest();
}



public enum CustomerType {
	PERSONAL,
	GROUP,
	COMPANY
}


