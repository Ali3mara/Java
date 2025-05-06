public class BankAccount {
    double balance;
    public BankAccount(double initial_balance) {
        balance = initial_balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
        balance += amount;
        System.out.println("Total balance: $" + getBalance());
    }
    public void withdraw(double amount) {
        System.out.println("Withdrawn: $" + amount);
        balance -= amount;
        System.out.println("Total balance: $" + getBalance());
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}