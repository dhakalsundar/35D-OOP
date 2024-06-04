// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind.
// Include private instance variables for the
// account number, account holder name, and account balance.
// Provide public methods to allow clients to deposit and withdraw funds,
 // as well as access the account balance.
// Ensure that the account balance cannot be accessed or modified directly. 
// Ensure that user cannot withdraw balance if it can go to negative
// note make constructer to fill the attribute on account opeaning
// make getter for account for account number and account holder name
// make a function display Current to display current balance
class BankingSystem {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankingSystem(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayCurrentBalance() {
        System.out.println("Current balance: " + accountBalance);
    }
}