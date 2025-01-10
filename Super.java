
class A{
   int a=15;
    void Show(){
        System.out.println("hello from superclass");
    }
    A(int a){
        System.out.println("super class constructer"+a);
    }
}

class B extends A{
    int a=20;

    void Show(){
        System.out.println("num:"+a);
        System.out.println("num:"+super.a);
        super.Show();
        System.out.println("Hello from subclass");
    }
    
    B(){
        super(10);
        System.out.println("Hello i am Sub Constructor");
    }
    
}


public class Super {
    public static void main(String[] args) {
        B r=new B();
          r.Show();
    }
}
