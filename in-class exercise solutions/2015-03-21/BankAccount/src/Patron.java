public class Patron {
    private String name;
    private int pocket;
    private BankAccount account;

    public Patron(String name, BankAccount account) {
        this.name = name;
        this.pocket = 0;
        this.account = account;
    }

    public Patron(String name, int pocket, BankAccount account) {
        this.name = name;
        this.pocket = pocket;
        this.account = account;
    }

    public void getMoneyFromAccount(int amount) {
        account.withdraw(amount);
        this.pocket += amount;
    }

    public void putMoneyInAccount(int amount) {
        this.pocket -= amount;
        account.deposit(amount);
    }

    public void printPocket() {
        System.out.println(name + "'s pocket: " + pocket);
    }
}
