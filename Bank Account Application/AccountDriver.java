// MAIN FUNCTION

import java.util.Scanner;

public class AccountDriver {
    // PROGRAM STARTS HERE ..
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int numAccounts = 0;
        Account[] accounts = new Account[10];

        int choice;

        do {
            choice = menu(keyboard);
            System.out.println();
            if (choice == 1){
                accounts[numAccounts++] = createAccount(keyboard);
            }else if (choice == 2){
                doDeposit(accounts,numAccounts,keyboard);
            }else if (choice == 3){
                doWithdraw(accounts, numAccounts, keyboard);
            }else if (choice == 4){
                applyInterest(accounts, numAccounts, keyboard);
            }else{
                System.out.println("Good Bye KING!");
            }
            System.out.println();
        }while (choice != 5);
    }

    /**
     * FUNCTION WHICH SEARCHES THE ACCOUNT WHICH THE USER ENTERED....
     * by matching the account number typed in the menu with the accounts we have stored in array[],BY GETTING THE INDEX..
     * @param accounts
     * @param count
     * @param accountNumber
     * @return
     */
    public static int searchAccount(Account[] accounts, int count, int accountNumber) {

        for(int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber()== accountNumber){
                return i;
            }
        }
        return -1;
    }

    /**
     * GIVING THESE (Account[] accounts, int count, accoutNumber, Scanner keyboard) all to
     * make use of them inside the Function ok.?..
     * FUNCTION TO DO DEPOSIT WHEN OPTION 2 IS CHOSEN IN MAIN MENU
     * @param accounts = Array of accounts
     * @param count = count of accounts present (will be given in main args function)
     * @param keyboard = Scanner obj
     */
    public static void doDeposit(Account[] accounts,int count, Scanner keyboard) {

        System.out.print("Enter Account Number: ");   // Asking accountNumber to deposit to the current account
        int accountNumber = keyboard.nextInt();

        //Search for account
        int index = searchAccount(accounts,count,accountNumber);  // by getting the accountNumber,matching the accountNumber

        //Ask Deposit Amount
        if (index >= 0){
            System.out.print("Enter Deposit Amount: ");
            double amount = keyboard.nextDouble();

            // depositing to the respective account of index taken by matching..
            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exists with Account Number " + accountNumber);
        }
    }

    /**
     * GIVING THESE (Account[] accounts, int count, accoutNumber, Scanner keyboard) all to
     * make use of them inside the Function ok.?..
     * FUNCTION TO DO WITHDRAW WHEN OPTION 3 IS CHOSEN IN MAIN MENU
     * @param accounts = Array of accounts
     * @param count = count of accounts present (will be given in main args function)
     * @param keyboard = Scanner obj
     */
    public static void doWithdraw(Account[] accounts, int count, Scanner keyboard){

        System.out.print("Enter Account Number: ");
        int accountNumber = keyboard.nextInt();

        //Search for account
        int index = searchAccount(accounts,count,accountNumber);

        if (index >= 0) {
            System.out.print("Enter Withdraw Amount: ");
            double amount = keyboard.nextDouble();
            accounts[index].withdraw(amount);
        }else {
            System.out.println("No account exists with Account Number" + accountNumber);
        }
    }

    /**
     * GIVING THESE (Account[] accounts, int count, accoutNumber, Scanner keyboard) all to
     * make use of them inside the Function ok.?..
     * FUNCTION TO DO APPLY INTEREST WHEN OPTION 4 IS CHOSEN IN MAIN MENU
     * @param accounts
     * @param count
     * @param keyboard
     */
    public static void applyInterest(Account [] accounts, int count, Scanner keyboard){

        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = keyboard.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if (index >= 0) {
            ((SavingsAccount)accounts[index]).applyInterest();
        }else {
            System.out.println("No account exists with Account Number" + accountNumber);
        }
    }

    /**
     * Function to show sub menu which Clicked from Create New Account in main Menu
     * @param keyboard - Scanner obj
     * @returns Type of account choice
     */

    public static int accountMenu(Scanner keyboard) {   // sub menu for Choice 1 - CreateAccount
        System.out.println("Select Account Type");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        }while(choice < 1 || choice > 2);

        return choice;
    }

    /**
     * Function to create a New Account where the accountMenu function is passed thereby to
     * continue the process of creating account.
     * @param keyboard - Scanner obj passed.
     * @return - it creates a account in the Account[] array of selected Type(Checking or Savings)
     */
    public static Account createAccount(Scanner keyboard) {   // while creating account we hv been storing it in array(of accounts)

        Account accounts = null;
        int choice = accountMenu(keyboard);  // Calling the previous menu and fixing the choice

        if (choice == 1) {   // Checking account           // By getting choice(as accountMenu returns)
            System.out.print("Enter Account Number: ");
            int accountNumber = keyboard.nextInt();
            System.out.print("Enter Transaction Fee: ");
            double fee = keyboard.nextDouble();

            accounts = new CheckingAccount(accountNumber, fee);      // new Checking account created.. in Account accounts[array]

        } else {         // Savings Account
            System.out.print("Enter Account Number: ");
            int accountNumber = keyboard.nextInt();
            System.out.print("Enter Interest Rate: ");
            double ir = keyboard.nextDouble();

            accounts = new SavingsAccount(accountNumber, ir);       // new Savings account created..  in Account accounts[array]

        }
        return accounts;
    }

    /**
     *  Menu to display and get the user's Selection.
     * @param keyboard passes the Scanner obj
     * @returns  Choice
     */

     public static int menu(Scanner keyboard) {

         System.out.println("Bank Account Menu");
         System.out.println("1. Create New Account");
         System.out.println("2. Deposit Funds");
         System.out.println("3. Withdraw Funds");
         System.out.println("4. Apply Interest");
         System.out.println("5. Quit");

         int choice;

         do {
             System.out.print("Enter choice: ");
             choice = keyboard.nextInt();
         }while (choice < 1 || choice > 5);

         return choice;

     }
}
