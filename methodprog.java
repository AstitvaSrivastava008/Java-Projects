import java.util.Scanner;
public class methodprog {
    void print()
    {
        System.out.println("Hello world");
    }
    void check(int a)
    {
        if(a%2==0)
        {
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
    }
    void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
    void prime(int a)
    {
        int primecount=0;
        for(int i=2;i<a/2;i++)
        {
          if(i%a==0)
          {
            primecount++;
            break;
          } 
        } 
          if(primecount==0)
          {
            System.out.println("the number is prime");
          }
          else
          {
            System.out.println("the number is not prime");
          }
        
    }
    void table(int a)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
    
    public static void main(String[] args) 
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        a=s.nextInt();
        methodprog obj=new methodprog();
        obj.print();
        obj.check(a);
        obj.factorial(a);
        obj.prime(a);
        obj.table(a);
    }

    }