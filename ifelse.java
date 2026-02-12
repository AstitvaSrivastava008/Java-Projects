import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        /* 
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        a=sc.nextInt();
        if(a>=10)
        {
            System.out.println(a + " is greater than or equal to 10");
        }
        else
        {
            System.out.println(a + " is less than 10");
        }
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        a=sc.nextInt();
        if(a<=10)
        {
            System.out.println(a + " is less than or equal to 10");
        }
        else
        {
            System.out.println(a + " is greater than 10");
    }
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer value: ");
    a=sc.nextInt();
    System.out.print("Enter second integer value: ");
    b=sc.nextInt();
    System.out.print("Enter third integer value: ");
    c=sc.nextInt();
    if(a>=b && a>=c)
    {
        System.out.println(a + " is the largest number");
    }
    else if(b>=a && b>=c)
    {
        System.out.println(b + " is the largest number");
    }
    else
    {
        System.out.println(c + " is the largest number");
    }
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer value: ");
    a=sc.nextInt();
    System.out.print("Enter second integer value: ");
    b=sc.nextInt();
    System.out.print("Enter third integer value: ");    
    c=sc.nextInt();
    if(a<=b && a<=c)
    {
        System.out.println(a + " is the smallest number");
    }
    else if(b<=a && b<=c)
    {
        System.out.println(b + " is the smallest number");
    }
    else
    {
        System.out.println(c + " is the smallest number");
    }
    int marks;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks obtained: ");
    marks=sc.nextInt();
    if(marks>80 && marks<90)
    {
System.out.println("Yes the marks are between 80 and 90");
    }
    else
    {
        System.out.println("No the marks are not between 80 and 90");
    }
    int marks;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks obtained: ");
    marks=sc.nextInt();
    if(marks==80||marks==90)
    {
        System.out.println("Yes the marks are either 80 or 90");
    }
    else
    {
        System.out.println("No the marks are neither 80 nor 90");
    }
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character ");
    c=sc.next().charAt(0);
    if(c=='a'||c=='b' )
    {
        System.out.println("Character is a or b");
    }
    else
    {
        System.out.println("Character is not a or b");
}
char c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character ");
c=sc.next().charAt(0);
if(c>='a' && c<='z')
{
    char ch=(char)(c-32);
    System.out.println("The uppercase of "+c+" is "+ch);
}
else
{
    char ch=(char)(c+32);
    System.out.println("The lowercase of "+c+" is "+ch);
}
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first integer value: ");
a=sc.nextInt();
System.out.println("Enter second integer value: ");
b=sc.nextInt();
if(a%b==0)
{
    System.out.println(a + " is divisible by " + b);
}
else
{
    System.out.println(a + " is not divisible by " + b);
}
int yr;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a year: ");
yr=sc.nextInt();
if((yr%4==0 && yr%100!=0) || (yr%400==0))
{
    System.out.println(yr + " is a leap year");
}
else
{
    System.out.println(yr + " is not a leap year");
}
}
char c;
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
System.out.println("Enter a character ");
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
    System.out.println(c + " is a vowel");
}
else
{
    System.out.println(c + " is not a vowel");
}
double fr,c;
Scanner sc=new Scanner(System.in);
int choice;
System.out.println("enter the choice");
choice=sc.nextInt();
switch(choice)
{
    case 1:System.out.print("Enter temperature in Fahrenheit: ");
    fr=sc.nextDouble();
    c=(fr-32)*5/9;
    System.out.println("Temperature in Celsius: " + c);
    break;
    case 2:System.out.print("Enter temperature in Celsius: ");
    c=sc.nextDouble();
    fr=(c*9/5)+32;
    System.out.println("Temperature in Fahrenheit: " + fr);
    break;
    default:
    System.out.println("Invalid choice.");
}
int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer value: ");
    a=sc.nextInt();
    System.out.print("Enter second integer value: ");
    b=sc.nextInt();
    System.out.print("Enter third integer value: ");
    c=sc.nextInt();
    if(a>=b && a>=c)
    {
        if(b>c)
        System.out.println("series in ascending order: " + c + ", " + b + ", " + a);
        else 
        {       
        System.out.println("series in ascending order: " + b + ", " + c + ", " + a);
        }
    }
    else if(b>=a && b>=c)
    {
        if(a>c)
        System.out.println("series in ascending order: " + c + ", " + a + ", " + b);
        else 
               
        System.out.println("series in ascending order: " + a + ", " + c + ", " + b);
    }
    else
    {
        if(a>b)
        System.out.println("series in ascending order: " + b + ", " + a + ", " + c);
        else        
        System.out.println("series in ascending order: " + a + ", " + b + ", " + c);
    }
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter choice  ");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1:System.out.println("Monday");
        break;
        case 2:System.out.println("Tuesday");
        break;
        case 3:System.out.println("Wednesday");
        break;
        case 4:System.out.println("Thursday");
        break;
        case 5:System.out.println("Friday");
        break;
        case 6:System.out.println("Saturday");
        break;
        case 7:System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid choice");
    }
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter choice  ");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1:System.out.println("January");
        break;
        case 2:System.out.println("February");
        break;
        case 3:System.out.println("March");
        break;
        case 4:System.out.println("April");
        break;
        case 5:System.out.println("May");
        break;
        case 6:System.out.println("June");
        break;
        case 7:System.out.println("July");
        break;
        case 8:System.out.println("August");
        break;
        case 9:System.out.println("September");
        break;
        case 10:System.out.println("October");
        break;
        case 11:System.out.println("November");
        break;
        case 12:System.out.println("December");
        break;
        default:
        System.out.println("Invalid choice");
    }*/

}
}



