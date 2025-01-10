public class ThrowDemo {
     public static void main(String[] args) {
        System.out.println(10/0);

       throw new ArithmeticException("divide by 0");
     }
    
}