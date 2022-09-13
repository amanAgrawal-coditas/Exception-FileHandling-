package Week_4.Assignment.BankingSystem;

public class InsufficientBalanceAmount extends Exception
 {
    InsufficientBalanceAmount()
    {
        System.out.println("Not Possible");
    }
    InsufficientBalanceAmount(String Message)
    {
        System.out.println(Message + " a valid value");
    }
 }
