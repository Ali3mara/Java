public class SavingAccount extends BankAccount {

    public SavingAccount(double initial_balance) {
        super(initial_balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount >= 0 && (balance-amount) >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: Minimum balance of $100 must be maintained.");
        }
    }
}
