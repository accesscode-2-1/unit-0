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
}
