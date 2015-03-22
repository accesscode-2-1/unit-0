public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void printBalance() {
        System.out.println("balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(100);
        BankAccount a2 = new BankAccount();

        // in class, i forgot to update these lines
        a1.printBalance();
        a2.printBalance();

        a1.withdraw(5);
        a2.deposit(200);

        a1.printBalance();
        a2.printBalance();
    }
}
