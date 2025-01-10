public class Nested_Try {
    public static void main(String[] args) {
        try {
         try {
                  int a[]={10,20,30};
                  System.out.println(a[5]);
            } catch (Exception e) {
                System.out.println("Out of Array Bound");
            }
            System.out.println(10/0);
        } catch (Exception e) {
           System.out.println("Arithmetic exception");
        }
    }
}
