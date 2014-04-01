/**
 * Created by Joseph on 3/31/14.
 */
import java.util.Scanner;
public class BankAccountTest {
    public static void main(String[] args) {
        String clientname;
        int accountnum;
        double amount;
        //create an object of the scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the person's name: ");
        clientname = input.nextLine();

        System.out.println("Enter the account number: ");
        accountnum = input.nextInt();

        System.out.println("Enter the balance for this client: ");
        amount = input.nextDouble();

        //open an account for acct1
        //create one object for the BankAccount class
        BankAccount acct1 = new BankAccount(clientname, accountnum, amount);
        //acct1.SetBalance(amount);
        //acct1.SetName(clientname);
        //acct1.SetAcct(accountnum);

        //make a deposit and a withdrawal into acct1
        System.out.println("Enter a deposit amount: ");
        amount = input.nextDouble();
        acct1.Deposit(amount);
        System.out.println("Enter an amount to withdraw: ");
        amount = input.nextDouble();
        acct1.Withdraw(amount);

        //print results
        System.out.println("Name: " + acct1.GetName());
        System.out.println("Account number: " +acct1.GetAcct());
        System.out.println("Balance: " + acct1.GetBalance());

    } //end of main method
} //end of BankAccountTest class
