abstract class Animal{
   public abstract void Eat();
}
class Dog extends Animal{
    public void Eat(){
        System.out.println("Eats Bones and meat");
      }
}

class Lion extends Animal{
      public void Eat(){
        System.out.println("Eats other animals");
      }
}



public class Abstraction1 {
    public static void main(String[] args) {
        Animal r =new Dog();
        r.Eat();
    }
}
