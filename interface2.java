interface A{
     void a1();  //public+abstract
    void a2();   //public+abstract
    default void a3()  //not a abstract method
    {
             System.out.println("Heyyy a3 from interface A may or may not override from implementing classes");
    }
    // this cannot be override by any class
    static void Show(){
            System.out.println("Hey i can show u...");
    }
}

class B implements A{
    public void a1(){
        System.out.println("Heyyy this is a1....B");
    }
    public void a2(){
        System.out.println("Heyyy this is a2....B");
    }
}
class C implements A{
    public void a1(){
        System.out.println("Heyyy this is a1....C");
    }
    public void a2(){
        System.out.println("Heyyy this is a2....C");
    }
}
public class interface2 {
   public static void main(String[] args) {
    B r1=new B();
    C r2=new C();
    r1.a1();
    r2.a2();
    r2.a3();

    // static method inside interface
   A.Show();
   }
     }
