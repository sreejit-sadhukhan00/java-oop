import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("what is your name");
        // String name =scanner.next();
        // System.out.println("Your name is "+name);
        String Fullname =scanner.nextLine();
        System.out.println("Your name is "+Fullname);

        System.out.println("please enter your age: ");
         short age=scanner.nextShort();
         System.out.println("your age is "+age);

    }
}
