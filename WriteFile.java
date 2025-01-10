import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
       try {
        FileWriter f=new FileWriter("C:\\Users\\SREEJIT\\OneDrive\\Desktop\\test.txt");
         try{
            f.write("java programming is the best language");
         }
         finally{
            f.close();
         }

         System.out.println("successfully writes data in file");


       } catch (IOException e) {
            System.out.println(e);
       }
    }
}
