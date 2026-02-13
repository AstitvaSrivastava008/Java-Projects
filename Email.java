
public class Email extends Polymorphism{
    void alert(){
        System.out.println("Email Alert");
    }
    public static void main(String args[]){
        Polymorphism p1=new Whatsapp();
        Polymorphism p2=new SMS();
        Polymorphism p3=new Email();
        p1.alert();
        p2.alert();
        p3.alert();
    }
}