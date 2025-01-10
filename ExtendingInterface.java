// how to inherit one  interface to another interface

// wants one method addition
interface sreejit{
    void add();
}

// wants both addition and multiplication method
interface Raj extends sreejit{
     void mult();
}

class Ankit implements Raj{
    public void add(){
       int a=10;int b=20;
     int  c=a+b;
          System.out.println("Addition "+c);
    }
    public void mult(){
        int a=4; int b=8;
        int c=a*b;
        System.out.println("Multiplication "+c);
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {
        Ankit r=new Ankit();
        r.add();
        r.mult();
    }
}
