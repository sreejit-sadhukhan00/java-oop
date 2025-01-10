// try Catch vs throws


// Throws---------->


// public class Comparison2 {
//     public static void Wait() throws InterruptedException{
//         for(int i=1;i<=10;i++){
//              System.out.println(i);
//              Thread.sleep(1000);
//         }
//     }
//     public static void main(String[] args) throws InterruptedException {
//         Wait();
         // this wont let the program ended normally 
        // System.out.println(10/0);
//     }
// }




// TryCatch method---------->




public class Comparison2 {
    public static void Wait() throws InterruptedException{
               for(int i=1;i<=10;i++){
             System.out.println(i);
             Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    try{
        Wait();
        System.out.println(10/0);
    }
    catch(Exception e){
        System.out.println("Exception Handled");
    }
     }
}

