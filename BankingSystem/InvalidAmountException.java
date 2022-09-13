package Week_4.Assignment.BankingSystem;

public class InvalidAmountException extends Exception{
    InvalidAmountException()
    {
        System.out.println("Amount not valid");
    }
    InvalidAmountException(String message)
    {
        System.out.println("The amount is not possible "+message);
    }
}
