import java.util.Scanner;
public class calculation
{
     int a,b;
    void get()
    {
       
        //to get the values to perform calculation
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=s.nextInt();
        System.out.print("Enter second number: ");
        b=s.nextInt();
    }
    void add()
    {
        //get();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    void subtract()
    {
        //get();
        int difference = a - b;
        System.out.println("The difference is: " + difference);
    }
    void multiply()
    {
        //get();
        int product = a * b;
        System.out.println("The product is: " + product);
    }
    void divide()
    {
        //get();
        if(b != 0)
        {
            int quotient = a / b;
            System.out.println("The quotient is: " + quotient);
        }
        else
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    void modulus()
    {
       // get();
        if(b != 0)
        {
            int remainder = a % b;
            System.out.println("The remainder is: " + remainder);
        }
        else
        {
            System.out.println("Error: Modulus by zero is not allowed.");
        }
    }
    public static void main(String [] args)
    {
        calculation calc = new calculation();
        calc.get();
        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
        calc.modulus();
    }
}