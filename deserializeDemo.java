import java.io.*;
public class deserializeDemo {
    public static void main(String[]args){
        try{
            FileInputStream fis=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            student s=(student)ois.readObject();
            System.out.println(s.id+" "+s.name);
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
