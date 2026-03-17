import java.io.*;
public class student implements Serializable {
    int id;
    String name;
    student(int i, String n){
        id=i;
        name=n;
    }
}
class SerializeDemo{
    public static void main(String[]args){
        try{
            student s=new student(101,"Ashish");
            FileOutputStream fos=new FileOutputStream("student.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully");
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
