Create two classes BankAccount and Patron
A BankAccount has a balance
A Patron has a name, an account, and his/her “pocket”.

For now, our constraints will be:
1) a patron can only interact with one account (1 => 1)
2) an account can interact with many patrons (1 => many)
3) we will deal with dollars ONLY, not cents

Create a program that creates objects of these types and have them interact with each other.

Some suggested “interactions”:
1) an account should allow withdrawals and deposits
2) a patron can get from and put money in the account
3) both should be able to show their current “balance”

Extra credit:
Make it so a patron can interact with multiple accounts
You will have to update your methods in Patron in order to specify the account with which you’re interacting.