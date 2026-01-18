public class TestBank {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount("SA1001", "Mohamed Aqeel", CustomerType.PERSONAL, 5000.00);
        CurrentAccount currentAccount = new CurrentAccount("CA1002", "Shamil Marikkar", CustomerType.COMPANY, 10000.00, 1000, 2000);

        savingsAccount.deposit(2000);
        savingsAccount.calculateInterest();

        currentAccount.depositCheque("CA1002", 1500, "CHK12345", 5000);
        currentAccount.withdraw(3000);
        currentAccount.calculateInterest();

        savingsAccount.transfer(currentAccount, 1000);
    }
}
