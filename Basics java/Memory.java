import java.awt.*;

public class Memory {
    public static void main(String[] args) {
        // call by value
        int a=5;
        int b=a;
        a=7;



        // call by reference
        Point k=new Point(1,2);
        Point newpoint=k;
        k.x=5;
        System.out.println(newpoint);
    }
}
