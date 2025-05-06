public class Main {
    public static void main(String[] args) {
        SavingAccount myacc = new SavingAccount(0);
        myacc.checkBalance();
        myacc.deposit(100);
        myacc.withdraw(5);
        
        System.out.println();

        myacc.deposit(100);
        myacc.withdraw(50);
    }
}