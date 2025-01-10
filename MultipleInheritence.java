interface A{
    void show();
}
interface B{
    void Disp();
}
class Multiple implements A,B{
      public void show(){
        System.out.println("Interface a & B");
       }
       public void Disp(){
        System.out.println("also inheritd Disp method");
       }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        Multiple r=new Multiple();
        r.show();
        r.Disp();
    }
}
