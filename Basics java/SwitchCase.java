import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your day:");
        int day=sc.nextInt();

        switch (day){
            case 1:System.out.println("monday");
            break;

            case 2:System.out.println("Tuesday");
            break;
             
            case 3:System.out.println("Wednesday");
            break;


            default: System.out.println("Some other day");
            break;
          }
    }
}
