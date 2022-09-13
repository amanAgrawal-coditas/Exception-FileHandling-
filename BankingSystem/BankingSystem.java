package Week_4.Assignment.BankingSystem;

import java.util.Scanner;
class Bank
 {
 static int balance = 0;
    Scanner sc = new Scanner(System.in);

    void enter()
    {

        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        if (amount <= 0)
        {
            try
            {
                throw new InvalidAmountException();
            }
            catch (InvalidAmountException iae)
            {
                iae.printStackTrace();
            }

        }
        else
        {
            balance = balance+amount;
            System.out.println("The balance is " + balance);
        }

    }
    void withDraw() {
        System.out.println(balance);
        System.out.println("Enter the amount you want to withdraw");

        int withDraw = sc.nextInt();
        if (withDraw > balance)
        {
            try
            {
                throw new InsufficientBalanceAmount("Amount is not ");
            }
            catch (InsufficientBalanceAmount insufficientBalanceAmount)
            {
                insufficientBalanceAmount.printStackTrace();
            }
        }
        else
        {
            balance=balance-withDraw;
            System.out.println("The amount left is " + balance);
        }

    }
 }

public class BankingSystem
 {
    public static void main(String[] args)
    {
     Bank bank=new Bank();
    }
 }
