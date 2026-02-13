import java.util.Scanner;
public class libraryproject {
    public static void main(String [] args)
    {
        Scanner s =new Scanner(System.in);
        String bookTitle;
        int bookavilability;
        System.out.println("Welcome to the Library Management System");
        System.out.print("Enter the title of the book: ");
        bookTitle=s.nextLine();
        System.out.print("Enter the number of available copies: ");
        bookavilability=s.nextInt();
        while(true)
        {
            System.out.println("Library Menu:");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Check Availability");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    if(bookavilability>0)
                    {
                        bookavilability--;
                        System.out.println("You have borrowed the book: " + bookTitle);
                    }
                    else
                    {
                        System.out.println("Sorry, the book is currently unavailable.");
                    }
                    break;
                case 2:
                    bookavilability++;
                    System.out.println("You have returned the book: " + bookTitle);
                    break;
                case 3:
                    System.out.println("Number of available copies of " + bookTitle + ": " + bookavilability);
                    break;
                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

    }
}
    


