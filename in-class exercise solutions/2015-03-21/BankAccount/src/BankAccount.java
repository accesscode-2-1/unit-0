public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(100);
        BankAccount a2 = new BankAccount();

        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}
