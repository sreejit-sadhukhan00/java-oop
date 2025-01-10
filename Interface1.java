import java.util.Scanner;

interface client{
    // public+abstract
    void input();
    void output();
}
class Dev implements client{
    String  name;double salary;
     public void input(){
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter Username: ");
                 name=sc.nextLine();
                 System.out.println("Enter Salary: ");
                 salary=sc.nextDouble();
             }

        public void output(){
                    System.out.println(name +" "+salary);
                }

                
}

public class Interface1 {
 public static void main(String[] args) {
        client c=new Dev();
        c.input();
        c.output();
    }
}


