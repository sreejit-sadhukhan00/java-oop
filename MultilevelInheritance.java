class A{     // superclass
    int a,b,c;
    void add(){
                  a=10;b=20;
                  c=a+b;
                  System.out.println("sum of two numbers"+c);
    }

    void sub(){
        a=100;b=40;
                  c=a-b;
                  System.out.println("subtraction of two numbers"+c);
    }
}

class B extends A{    // subclass1
          void mul(){
            a=4;b=10;
            c=a*b;
            System.out.println("multiplication of two numbers"+c);
          }
          void division(){
            a=40;b=10;
            c=a/b;
            System.out.println("division of two numbers"+c);
          }
}
class C extends B{ //subclass2
      void remainder(){
        a=10;b=2;
        c=a%b;
        System.out.println("remainder of two numbers"+c);
      }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        C ref=new C();
        ref.remainder();
        ref.division();
        ref.sub();
    }
}
