import java.io.File;
import java.io.FileWriter;

public class fil {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {    
                System.out.println("File created: " + myObj.getName());
            } else {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!"); 
                myWriter.close();
                
                System.out.println("File already exists.");
            }       
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
           
        }
    }
    
}
