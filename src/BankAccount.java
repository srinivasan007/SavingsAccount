/**
 * Created by Joseph on 3/31/14.
 */
public class BankAccount {
    //date members, called fields in java
    private int acctnum;
    private String name;
    private double balance;

    //constructor Definition
    public BankAccount(String acctname, int acct, double balance)
    {
        name = acctname;
        acctnum = acct;
        balance = acctbalance;
    }
    //define the class methods
    //gets the client's name
/** public void SetName(String custname)
    {
        name = custname;
    }
    //set the customer's account number
    public void SetAcct(int custacct)
    {
        acctnum = custacct;
    }
    //set the client's balance
    public void SetBalance(double amount)
    {
        balance = amount;
    }
    public String GetName()
    {
        return name;
    }
    //set the customer's account number
    public int GetAcct()
    {
        return acctnum;
    }
    //set client's balance
    public double GetBalance()
    {
        return balance;
    }**/
    public void Deposit(double amount)
    {
        balance += amount; //balance = balance = amount;
    }
    public void Withdraw(double amount)
    {
        balance -= amount; //balance = balance
    }
}
