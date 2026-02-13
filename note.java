import java.util.Scanner;
public class note {
    static{
        System.out.println("DENOMINATION OF NOTES");
    System.out.println("1.500\n2.200\n3.100\n4.50\n5.20\n6.10\n7.5\n8.2\n9.1\n10.total number of notes");

    }
    int amt;
    void amount()
        {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the amount");
    amt=sc.nextInt();
        }
    void fivehundred()
    {

       int fh;
       fh=amt/500;
       System.out.println("number of 500 notes is:"+fh);
       amt=amt%500;
    }
    void twohundred()
    {
       int th;
       th=amt/200;
       System.out.println("number of 200 notes is:"+th);
       amt=amt%200;
    }
    void hundred()
    {
       int h;
       h=amt/100;
       System.out.println("number of 100 notes is:"+h);
       amt=amt%100;
    }
        void fifty()
        {
        int f;
        f=amt/50;
        System.out.println("number of 50 notes is:"+f);
        amt=amt%50;
        }
        void twenty()
        {
        int t;
        t=amt/20;
        System.out.println("number of 20 notes is:"+t);
        amt=amt%20;
        }
        void ten()
        {
        int te;
        te=amt/10;
        System.out.println("number of 10 notes is:"+te);
        amt=amt%10;
        }
        void five()
        {
            int f;
            f=amt/5;
            System.out.println("number of 5 notes is:"+f);
            amt=amt%5;
        }
        void two()
        {
            int tw;
            tw=amt/2;
            System.out.println("number of 2 notes is:"+tw);
            amt=amt%2;
        }
        void one()
        {
            int o;
            o=amt/1;
            System.out.println("number of 1 notes is:"+o);
            amt=amt%1;
        }

    public static void main(String[] args)
     {
      
        note obj=new note();
           int ch;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the choice");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("number of notes in 500");
            obj.amount();
            obj.fivehundred();
            break;
            case 2:
            System.out.println("number of notes in 200");
            obj.amount();
            obj.twohundred();
            break;
            case 3:
            System.out.println("number of notes in 100");
            obj.amount();
            obj.hundred();
            break;
            case 4:
            System.out.println("number of notes in 50");
            obj.amount();
            obj.fifty();
            break;
            case 5:
            System.out.println("number of notes in 20");
            obj.amount();
            obj.twenty();
            break;
            case 6:
            System.out.println("number of notes in 10");
            obj.amount();
            obj.ten();
            break;
            case 7:
            System.out.println("number of notes in 5");
            obj.amount();
            obj.five();
            break;
            case 8:
            System.out.println("number of notes in 2");
            obj.amount();
            obj.two();
            break;
            case 9:
            System.out.println("number of notes in 1");
            obj.amount();
            obj.one();
            break;
            default:
            System.out.println("total number of notes");
            obj.amount();
            obj.fivehundred();
            obj.twohundred();
            obj.hundred();
            obj.fifty();
            obj.twenty();
            obj.ten();
            obj.five();
            obj.two();
            obj.one();
        }

    }
}
