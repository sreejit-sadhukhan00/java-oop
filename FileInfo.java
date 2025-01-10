import java.io.*;
public class FileInfo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\SREEJIT\\OneDrive\\Desktop\\test.txt");

        if(f.exists()){
              System.out.println("File Name :"+f.getName());
              System.out.println("File Location :"+f.getAbsolutePath());
              System.out.println("File Writable :"+f.canWrite());
              System.out.println("File length :"+f.length());
        }
        else{
              System.out.println("file isnt exist");
        }
    }
}
