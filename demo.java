/*public class demo {
   static int a=10;
    public static void main(String[] args) {    
       // demo d=new demo();
        System.out.println(a);
    }
    
}*/

class test
{
    volatile boolean a=true; 
    public static void main(String[] args)
     {
test t=new test();
 System.out.println(t.a);
}
}