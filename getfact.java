package package9;
import package3.*;
import java.util.Scanner;

public class getfact {
void fectorial()
{
    int fact=1;
    for(int i=1;i<=setfact.getnum();i++)
    {
        fact=fact*i;
    }
    System.out.println("the factorial is "+fact);
}
public static void main(String[] args) {
   // setfact g=new setfact();

    getfact f=new getfact();
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the value");
    int n1=sc.nextInt();
    setfact.setnum(n1);   
    //System.out.println("the value is "+setfact.getnum());
    f.fectorial();
}
    
}
