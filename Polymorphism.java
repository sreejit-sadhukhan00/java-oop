// compiletime polymorphism  // Method Overloading

// return type of the method can be anything

class A{
    void add(){
        int a=10,b=20;
        double c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        A r=new A();
        r.add();
        r.add(12,34);
        r.add(43,23.09);
    }
}
