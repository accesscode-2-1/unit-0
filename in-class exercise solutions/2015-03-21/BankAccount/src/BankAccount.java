public class BankAccount {
    private String label;
    private int balance;

    public BankAccount(String label) {
        this.label = label;
        this.balance = 0;
    }

    public BankAccount(String label, int balance) {
        this.label = label;
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
        System.out.println("balance in account '" + label  + "': " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("a1", 100);
        BankAccount a2 = new BankAccount("a2");

        // in class, i forgot to update these lines
        a1.printBalance();
        a2.printBalance();

        a1.withdraw(5);
        a2.deposit(200);

        a1.printBalance();
        a2.printBalance();
    }
}
