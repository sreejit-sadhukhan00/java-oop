// class A{
//     int a;
//     A(int a)
//     {
//            this.a=a;
//     }
//     void show(){
//         System.out.println(a);
//     }
// }


// public class This {
   
//     public static void main(String[] args) {
//         A r =new A(100);
        
//               r.show();
// }
// }
// point 3---------->

class A{
    A(){ 
        this(190); //this will call the parameterized constructor
          System.out.println("Learn java");
          
    }
    A(int a){
        // this() ;  //this will call the default constructor
        System.out.println(a);
    }
}



public class This {
   
    public static void main(String[] args) {
        A r =new A();
}
}


