// Child Class as Checking Account..
// Checking account contains Transaction Fee

public class CheckingAccount extends Account {

    //Default Transaction Fee for Checking Account
    private static double FEE = 2.5;

    public CheckingAccount(){     // default Constructor
        super();
    }

    /**
     * Parameter Constructor to initialize Checking account
     * with a custom Account Number and its Transaction Fee
     * @param accountNumber - passed to BaseClass Account...
     */

    public CheckingAccount(int accountNumber, double fee) { // Constructing fee because Checking Acc has fee changes...
        super(accountNumber);
        FEE = fee;
    }

    /**
     * Function or method to deposit... when amount>0
     * And apply Transaction Fee for CheckingAccount
     * @param amount is the amount to be deposited by the customer...
     */

    public void deposit(double amount) {
        if (amount>0){
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);

            balance -= FEE;
            System.out.printf("Fee %.2f applied%n",FEE);
            System.out.printf("Current Balance is %.2f%n",balance);
        }else {
            System.out.println("Deposit Amount cannot be Negative");
        }
    }

    /**
     * Function or method to withdraw...when (amount+FEE)<=balance and amount>0
     * And apply Transaction Fee also for ChechingAccount
     * @param amount is amount to be withdrawn by the customer...
     */
    public void withdraw(double amount) {
        if (amount>0){
            if ((amount+FEE)<=balance){
                balance -= amount;
                System.out.printf("Amount %.2f withdrawn%n", amount);

                balance -= FEE;
                System.out.printf("Fee %.2f applied%n",FEE);
                System.out.printf("Current Balance is %.2f%n",balance);
            }
        }else {
            System.out.println("Withdraw amount cannot be Negative");
        }
    }
}
