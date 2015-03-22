public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if(amount > balance) {
            System.out.println("not enough money in this account");
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
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
