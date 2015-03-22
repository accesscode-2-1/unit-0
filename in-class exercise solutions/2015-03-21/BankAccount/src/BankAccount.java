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

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(100);
        BankAccount a2 = new BankAccount();

        System.out.println(a1.balance);
        System.out.println(a2.balance);

        a1.withdraw(5);
        a2.deposit(200);

        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}
