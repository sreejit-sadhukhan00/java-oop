import java.util.Scanner;

class A{
    private int val;   //data hiding 
    
    public void setVal(int x){
           val=x;
    }
    public int getVal(){
        return val;
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        A r=new A();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value=sc.nextInt();
        r.setVal(value);
        System.out.println(r.getVal());
    }
}
