import java.util.Scanner;

public class ControlFlow {
    public static void main(String[]args){
        int a=5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int b=sc.nextInt();
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
