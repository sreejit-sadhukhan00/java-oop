import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\SREEJIT\\OneDrive\\Desktop\\test.txt");

        try {
            if(f.createNewFile()){
                System.out.println("file successfully created");
            }
            else{
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
