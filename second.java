package package2;
import package1.*;
import java.util.*;
class second extends first {
    void sum()
    {
        int c;
        c=a+b;
        System.out.println("the sum is "+c);
    }
    public static void main(String[] args) {
        first f=new second();
        //second s=new second();
    
       f.input();
       f.sum();
    }
}
    