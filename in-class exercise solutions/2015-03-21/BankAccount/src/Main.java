public class Main {
    public static void main(String[] args) {
        //Scenario 1: test account/patron interaction

        //create account
        BankAccount c4qAccount = new BankAccount(1000);

        // create patron, associating account with patron
        Patron john = new Patron("John", 0, c4qAccount);

        // do something (behavior)
        john.getMoneyFromAccount(10);

        // verify state
        john.printPocket();
        c4qAccount.printBalance();

        System.out.println();

        // Scenario 2: test multiple patrons using single account

        // create 2nd patron, associating same account as before
        Patron davis = new Patron("Davis", 1000, c4qAccount);

        // do something (behavior)
        davis.getMoneyFromAccount(20);

        // verify state
        davis.printPocket();
        john.printPocket();
        c4qAccount.printBalance();
    }
}
