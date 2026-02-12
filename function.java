/*import java.util.Scanner;
public class function {
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character value: ");
        char a = sc.next().charAt(0);
        System.out.println("display the charater=" + a);
        System.out.print("Enter the integer value: ");
        int i = sc.nextInt();
        System.out.println("display the integer value=" + i);
        System.out.print("Enter the  float value: ");
        float f = sc.nextFloat();
        System.out.println("display the float value=" + f);
        System.out.print("Enter the double value: ");
        double d = sc.nextDouble();
        System.out.println("display the double value=" + d);
        System.out.print("Enter the string with no space value: ");
        String str = sc.next();
        System.out.println("display the string without space value=" + str);
        System.out.print("Enter the string with space value: ");
        String s = sc.nextLine();
        System.out.println("display the string with space value=" + s);
        System.out.println("Additional methods");
        System.out.print("Enter the boolean value: ");
        boolean b = sc.nextBoolean();
        System.out.println("display the boolean value=" + b);
        System.out.print("Enter the long value: ");
        long l = sc.nextLong();
        System.out.println("display the long value=" + l);

    }
}*/

import java.util.Scanner;
public class function {
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character value: ");
        char a = sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            System.out.println(a + " is a Vowel");
        }
        else
        {
            System.out.println(a + " is a Consonant");
        }
    }
}