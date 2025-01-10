class A{
    A  Show(){
           System.out.println("heyyy");
           return this;
      }
}
class B extends A{
      @Override  
    B Show(){
        // super.Show();
        System.out.println("helloo");
        return this;
   }
}

public class Covarient {
    public static void main(String[] args) {
        B ref=new B();
        ref.Show();
    }
}
