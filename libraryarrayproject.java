
    import java.util.Scanner;
public class libraryarrayproject {
    int n,bookavailability[];
    String bookTitle[];
    static{
        System.out.println("Welcome to the Library Management System");
            System.out.println("Library Menu:");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Check Availability");
            System.out.println("4. Exit");
    }
    void  booktitle()
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        n=s.nextInt();
        bookTitle=new String[n];  
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the title of book " + (i+1) + ": ");
            bookTitle[i]=s.next();
        }
        System.out.println("Books in the library:");
        for(int i=0;i<n;i++)
        {
            System.out.println((i+1) + ". " + bookTitle[i]);
        } 

    }
    void bookavailability()
    {
        Scanner s =new Scanner(System.in);
        bookavailability=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the number of available copies for book " + (i+1) + ": ");
            bookavailability[i]=s.nextInt();
        }
        System.out.println("Book availability in the library:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Book " + (i+1) + " has " + bookavailability[i] + " copies available.");
        } 
    }
    void borrow()
    {
        for(int i=0;i<n;i++)
        {
            if(bookavailability[i]>0)
            {
                bookavailability[i]--;
                System.out.println("You have borrowed book " + (i+1));
            }
            else
            {
                System.out.println("Book " + (i+1) + " is not available for borrowing.");
            }
        }
    }
    void returnbook()
    {
        for(int i=0;i<n;i++)
        {
            bookavailability[i]++;
            System.out.println("You have returned book " + (i+1));
        }
    }
    public static void main(String[] args)
    {
        int ch ;
        libraryarrayproject lib=new libraryarrayproject();
        lib.booktitle();
        lib.bookavailability();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the choice");
        ch=s.nextInt();
        while(true)
        {
        switch(ch)
        {
         case 1:
         System.out.println("Borrowing Books:");
         lib.borrow();
            break;
            case 2:
            System.out.println("Returning Books:");
            lib.returnbook();
            break;
            case 3:
            System.out.println("Checking Availability:");
            lib.bookavailability();
            break;
            case 4:
            System.out.println("Exiting the system. Thank you!");
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
    }

    }
    
}


