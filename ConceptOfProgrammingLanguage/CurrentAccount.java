public class CurrentAccount extends BankAccount {
    private int chequeNoStart;
    private int chequeNoEnd;

    public CurrentAccount(String accountID, String accountHolderName, CustomerType customerType, double balance,int chequeNoStart, int chequeNoEnd) {
        super(accountID, accountHolderName, customerType, balance);
        this.chequeNoStart = chequeNoStart;
        this.chequeNoEnd = chequeNoEnd;
    }

    @Override
    void calculateInterest() {
        System.out.println("Current accounts do not incur interest.");
    }

    public void depositCheque(String accountID, int chequeNo, String chequeAccountNo, double amount) {
        if (chequeNo >= chequeNoStart && chequeNo <= chequeNoEnd) {
            deposit(amount);
            System.out.println("Cheque deposited successfully: " + amount + " for Account ID: " + accountID);
        } else {
            System.out.println("Invalid cheque number.");
        }
    }
}
