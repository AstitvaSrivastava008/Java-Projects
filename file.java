import java.io.*;
import java.util.*;
public class file {
    //file(){
        
  
    public static void main(String[] args){
       // file f=new file();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("1. Create a file");
        System.out.println("2. Write to a file");
        System.out.println("3. Read from a file");
        System.out.println("4. Delete a file");
        System.out.println("5. Read a file using BufferedReader");
        System.out.println("6. Exit");
        System.out.println("enter the choice");
        int ch =in.nextInt();
        switch(ch){
            case 1:
                try{
                    File myObj = new File("filename1.txt");
                    if (myObj.createNewFile()) {    
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File already exists.");
                    }       
                }
                catch (Exception e) {
                    System.out.println("An error occurred.");
                }
                break;
            case 2:
                try{
                    FileWriter myWriter = new FileWriter("filename1.txt");
                    myWriter.write("hiiiiiiiiiiiiiiiiiiiiiiiiiiii!"); 
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
                catch (Exception e) {
                    System.out.println("An error occurred.");
                }
                break;
            case 3:
                try{
                    File myObj = new File("filename1.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                }
                catch (Exception e) {
                    System.out.println("An error occurred.");
                }
                break;
                case 4:
                try{
                    File myObj = new File("filename1.txt");
                    if (myObj.delete()) {    
                        System.out.println("Deleted the file: " + myObj.getName());
                    } else {
                        System.out.println("Failed to delete the file.");
                    }       
                }
                catch (Exception e) {
                    System.out.println("An error occurred.");
                }
                break;
                case 5:
                try{
                    FileReader obj = new FileReader("filename1.txt");
                    BufferedReader br = new BufferedReader(obj);
                    String str;
                    while((str = br.readLine()) != null){
                        System.out.println(str);
                    }
                    br.close();
                }
                catch (Exception e) {
                    System.out.println("An error occurred.");
                }
                break;
                case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
}
    
