import java.util.Scanner;
public class atm {
    public static void main(String [] args)
    {
        Scanner s =new Scanner(System.in);
        int balance, withdraw, deposit;
        System.out.println("Welcome to the ATM Machine");
        System.out.print("Enter your initial balance: ");
        balance=s.nextInt();
        while(true)
        {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw=s.nextInt();
                    if(withdraw>balance)
                    {
                        System.out.println("Insufficient balance!");
                    }
                    else
                    {
                        balance-=withdraw;
                        System.out.println("Please collect your cash.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit=s.nextInt();
                    balance+=deposit;
                    System.out.println("Amount deposited successfully.");
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}