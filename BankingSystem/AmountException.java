package Week_4.Assignment.BankingSystem;
import java.util.Scanner;
public class AmountException
 {
     Scanner sc=new Scanner(System.in);
     boolean loop=true;

     void Banking()
     {
         while (loop = true)
         {
             System.out.println("Enter Choice 1 to Deposit");
             System.out.println("Enter 2 to Withdraw");
             System.out.println("Enter 3 to exit");
             int choice = sc.nextInt();
             Bank bank = new Bank();
             switch (choice) {
                 case 1:
                 {
                     bank.enter();
                     break;
                 }
                 case 2:
                 {
                     bank.withDraw();
                     break;
                 }
                 case 3:
                 {
                     System.exit(0);
                     break;
                 }
                 default:
                 {
                     System.out.println("enter a valid choice");
                 }

             }
         }
     }
    public static void main(String[] args)
    {
        AmountException amountException=new AmountException();
        amountException.Banking();
    }
}
