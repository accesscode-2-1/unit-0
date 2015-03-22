public class Patron {
    private String name;
    private int pocket;
    private BankAccount[] accounts;

    public Patron(String name, BankAccount account) {
        this.name = name;
        this.pocket = 0;
        this.accounts = new BankAccount[]{ account };
    }

    public Patron(String name, int pocket, BankAccount account) {
        this.name = name;
        this.pocket = pocket;
        this.accounts = new BankAccount[]{ account };
    }

    public Patron(String name, BankAccount[] accounts) {
        this.name = name;
        this.pocket = 0;
        this.accounts = accounts;
    }

    public Patron(String name, int pocket, BankAccount[] accounts) {
        this.name = name;
        this.pocket = pocket;
        this.accounts = accounts;
    }

    // update this method to provide backwards compatibility for first 5 scenarios...
    public void getMoneyFromAccount(int amount) {
        if(accounts[0].withdraw(amount)) {
            this.pocket += amount;
        }
    }

    public void getMoneyFromAccount(int amount, int accountId) {
        if(accounts[accountId].withdraw(amount)) {
            this.pocket += amount;
        }
    }

    // update this method to provide backwards compatibility for first 5 scenarios...
    public void putMoneyInAccount(int amount) {
        if(amount > pocket) {
            System.out.println("not enough money in " + name + "'s pocket");
        }
        else {
            this.pocket -= amount;
            accounts[0].deposit(amount);
        }
    }

    public void putMoneyInAccount(int amount, int accountId) {
        if(amount > pocket) {
            System.out.println("not enough money in " + name + "'s pocket");
        }
        else {
            this.pocket -= amount;
            accounts[accountId].deposit(amount);
        }
    }

    public void printPocket() {
        System.out.println(name + "'s pocket: " + pocket);
    }
}
