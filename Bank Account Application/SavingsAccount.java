// Child class for Savings Account..
// Savings account contains Interest rates

public class SavingsAccount extends Account {

    // There will be InterestRate in Savings Account...
    private double interestRate;

    public SavingsAccount() {            // default Constructor
        super();
    }

    // Parameter Constructor to initialize InterestRate and make use of them in program (this class)...

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {                   // This is Muthuram's Bank method of calculating Interest..
        return (balance * interestRate)/100;         // interest rate will be the applied interest rate...
    }

    public void applyInterest() {    // for depositing Interest, soo..
        double interest = calcInterest();
        System.out.printf("Interest Amount %.2f added to the balance",interest);
        deposit(interest);
    }

    /**
     * Function or method to deposit... when amount>0
     * And NO Transaction Fee application for the SavingsAccount
     * @param amount is the amount to be deposited by the customer...
     */
    public void deposit(double amount) {
        if (amount>0){
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is %.2f%n",balance);
        }else {
            System.out.println("Deposit Amount cannot be Negative");
        }
    }

    /**
     * Function or method to withdraw...when (amount+FEE)<=balance and amount>0
     * And NO Transaction Fee application for the SavingsAccount
     * @param amount is amount to be withdrawn by the customer...
     */
    public void withdraw(double amount) {
        if (amount>0){
            if ((amount)<=balance){
                balance -= amount;
                System.out.printf("Amount %.2f withdrawn%n", amount);
                System.out.printf("Current Balance is %.2f%n",balance);
            }
        }else {
            System.out.println("Withdraw amount cannot be Negative");
        }
    }
}
