public class SavingAccount extends BankAccount {
    
    public SavingAccount(String accountID, String accountHolderName, CustomerType customerType, double balance) {
        super(accountID, accountHolderName, customerType, balance);
        this.intrestRate = 3.5;
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * intrestRate / 100;
        System.out.println("Interest calculated for Savings Account: " + interest);
    }
}
