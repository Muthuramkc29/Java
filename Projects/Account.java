// Abstract Class Containing Abstract methods..

public abstract class Account {     // Base class or Super class..
    private int accountNumber;
    protected double balance;

    public Account() {    // Default Constructor

    }

    public Account(int accountNumber) {   // Parameter Constructor
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * IN This account we can perform two actions
     * 1. Deposit
     * 2. Withdraw
     */

    /**
     * Their Methods Givenn:
     * As they are done in their respective ACCOUNTS, their methods are ABSTRACT here...
     */
    public abstract void deposit(double amount);
        // Abstract methods dont need body

    public abstract void withdraw(double amount);
        // same here.. Abstract methods dont need body
}
