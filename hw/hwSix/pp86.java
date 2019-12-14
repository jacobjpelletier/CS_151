//**********************************************************************************************************************
// PP 8.6
// The L&L Bank can handle up to 30 customers who have savings accounts. Design and implement a program that manages the
// accounts. Keep track of the key information and allow each customer to make deposits and withdrawals. Produce
// appropriate error messages for invalid transactions. HINT: You may want to base your accounts on the Account class
// from Chapter 4. Also provide a method to add 3 percent interest to all accounts whenever the method is invoked.
//**********************************************************************************************************************

import java.text.NumberFormat;

public class pp86 {

    public static void main(String[] args) {

        Bank landl = new Bank(40); //The L&L Bank can handle up to 40 customers who have savings accounts.

        System.out.println(landl);

        System.out.println();

        landl.addInterestToAll();

        System.out.println(landl);
    }
}

class Bank {
    //------------------------------------------------------------------------------------------------------------------
    // Design and implement a program that manages the accounts.
    //------------------------------------------------------------------------------------------------------------------
    private Account[] bankAccounts;
    private int customerCount;

    public Bank(int customers) {

        bankAccounts = new Account[customers];
        customerCount = customers;

        for (int num = 0; num < customerCount; num ++) {
            // instantiate 40 customers with a unique name, bank acount number, and amount in bank.
            bankAccounts[num] = new Account("Smith" + (num+1), ((num*3)+1)+(num*20)+(num*100),
                    num*100);
        }
    }

    public void addInterestToAll() {

        for (Account element : bankAccounts) {
            element.addInterest();
        }
    }

    public String toString() {
        String result = "";
        for (Account element : bankAccounts) {
            result += element + "\n";
        }
        return result;
    }
}

class Account {

    private final double RATE = 0.03; // interest rate of 3%

    private long acctNumber;
    private double balance;
    private String name;

    //------------------------------------------------------------------------------------------------------------------
    // Sets up the account by defiing its owner, account number, and initial balance.
    //------------------------------------------------------------------------------------------------------------------
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public Account() {
        String name = "Smith";
        int acctNumber = 999;
        double balance = 100.00;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Deposits the specified amount into the account. Returns the new balance.
    // Keep track of the key information and allow each customer to make deposits and withdrawals.
    //------------------------------------------------------------------------------------------------------------------
    public double deposit(double amount) {
        double temp = 0;
        if (amount > 0) {
            temp = balance + amount;
        }
        balance = temp;
        return balance;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Withdraws the specified amount from the account and apples the fee. Returns the new balance
    // Keep track of the key information and allow each customer to make deposits and withdrawals.
    //------------------------------------------------------------------------------------------------------------------
    public double withdraw(double amount, double fee) {
        double temp = 0;
        if ((amount + fee) < balance) {
            balance = balance - amount - fee;
        }
        balance = temp;
        return balance;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Adds interest to the account and returns the new balance
    //------------------------------------------------------------------------------------------------------------------
    public double addInterest() {
        balance += (balance*RATE);
        return balance;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Returns balance of current account
    //------------------------------------------------------------------------------------------------------------------
    public double getBalance() {
        return balance;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Returns a one-line description of the account as a string
    //------------------------------------------------------------------------------------------------------------------
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}
