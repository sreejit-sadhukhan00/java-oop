
interface A{
    default void call(){
        add(19, 34);
    }
    private void add(int x , int y){
        int c=x+y;
        System.out.println("Addition :"+c);
    }
}

class B implements A{
    public void sub(int x, int y){
        System.out.println("Subtraction :"+(x-y));
    }
}

public class InterfacePrivate {
    public static void main(String[] args) {
        B ref=new B();
        ref.call();
         ref.sub(65,80);
    }
}
