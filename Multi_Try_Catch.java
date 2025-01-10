public class Multi_Try_Catch {
  public static void main(String[] args) {
    try {
        int a=10;
        int b=0;
       int c=a/b;
       System.out.println(c);
    } catch (Exception e) {
        System.out.println("Arithmetic Exception");
    }


    try {
        int a[]={10,20,30,40,50};
        System.out.println(a[5]);
    } catch (Exception e) {
       System.out.println("ArrayOutOfBoundException");
    }
  }
    
}