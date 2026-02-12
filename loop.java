import java.util.Scanner; 
public class loop {
    public static void main(String[] args) {
       /*  int fact=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: "); 
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        
        int n;
        double sum=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: "); 
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=(double)(((10*i)+i)/i);
        }
        System.out.println("Sum is: " + sum);
        
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }

for(int i=0;i<=10;i++)
{
    System.out.println(i);
}
for(int i=9;i>=0;i--)
{
    System.out.println(i);
}
for(int i=10;i>=0;i--)
{
    System.out.println(i);
    }

for(int i=0;i<=10;i+=2)
{
    System.out.println(i);
}

for(int i=0;i<=50;i+=5)
{
    System.out.println(i);
}
for(int i=50;i>0;i-=5)
{
    System.out.println(i);
}
int sum=0;
for(int i=1;i<=10;i++)
{
     sum+=i;
}
System.out.println("neternthe    sum is: " + sum);
    
    int sum=0;
    for(int i=1;i<=10;i++)
{
    if (i%2==0)
     sum+=i;
}
System.out.println("even   sum is: " + sum);

int sum=0;
    for(int i=1;i<=10;i++)
{
    if (i%2!=0)
     sum+=i;
}
System.out.println("odd   sum is: " + sum);

int a ,b;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter first number: ");
a=sc.nextInt();
System.out.print("Enter second number: ");
b=sc.nextInt();
for(int i=a+1;i<b;i++)
{
    System.out.println(i);
}

int a ,b,sum=0;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter first number: ");
a=sc.nextInt();
System.out.print("Enter second number: ");
b=sc.nextInt();
for(int i=a+1;i<b;i++)
{
    sum+=i;
}
    System.out.println("sum is ="+sum);
    
    int fact=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of " + n + " is: " + fact);
    
    int prime_count=0,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            prime_count++;
        }
    }
    if(prime_count==2)
    {
        System.out.println(n + " is a prime number.");
    }
    else
    {
        System.out.println(n + " is not a prime number.");
}
int fibonacci_count=10;
int n1=0,n2=1,n3;
System.out.print("Fibonacci="+n1 + " " + n2);
for(int i=2;i<fibonacci_count;i++)
{
    n3=n1+n2;
    System.out.print(" " + n3);
    n1=n2;
    n2=n3;
}

int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}

int n,j , table;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();
j=sc.nextInt();
for(int i=1;i<=j;i++)
{
    table=n*i;
    System.out.println(n + " * " + i + " = " + table);
}

int i=0;
while(i<10)
{
    System.out.println(i);
    i++;
}

int i=1;
while(i<=10)
{
    System.out.println(i);
    i++;
}

int i=1;
while(i<=10)
{
    System.out.println(i);
    i+=2;
}

int fact=1,n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();
while (n!=0) 
{
    fact=fact*n;
    n--; 
}
System.out.println("Factorial is: " + fact);

int table,n,j=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();

while(j<=10)
{
    table=n*j;
    System.out.println(n + " * " + j + " = " + table);
    j++;
}

int n,sum=0,i=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();
while(i<=n)
{
    sum+=i;
    i++;
}
System.out.println("Sum is: " + sum);

int a,b,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
a=sc.nextInt();
System.out.print("Enter second number: ");
b=sc.nextInt();
int i=a+1;
while(i<b)
{
    sum+=i;
    i++;
}
System.out.println("Sum is: " + sum);

int a,b,esum=0,osum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
a=sc.nextInt();
System.out.print("Enter second number: ");
b=sc.nextInt();
int i=a+1;
while(i<b)
{
    if(i%2==0)
    {
        esum+=i;
    }
    else
    {
        osum+=i;
    }
    i++;
}
System.out.println("Even sum is: " + esum);
System.out.println("Odd sum is: " + osum);

int prime_count=0,n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a positive integer: ");
n=sc.nextInt();
int i=1;
while(i<=n)
{
    if(n%i==0)
    {
        prime_count++;
    }
    i++;
}
if(prime_count==2)
{
    System.out.println(n + " is a prime number.");
}
else
{
    System.out.println(n + " is not a prime number.");
}

int fibonacci_count=10;
int n1=0,n2=1,n3;
System.out.print("Fibonacci="+n1 + " " + n2);
int i=2;
while(i<fibonacci_count)
{
    n3=n1+n2;
    System.out.print(" " + n3);
    n1=n2;
    n2=n3;
    i++;
    }
}*/

}
}
