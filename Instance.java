// difference between instance and static block
class A{
  {    //instance
       System.out.println("Learn Java");
    }

    A(){
        System.out.println("default Constructor");
    }
}


public class Instance {
    static{   //static block
        System.out.println("I am Static Block");
      }
    public static void main(String[] args) {
        // A r=new A();
    }
}
