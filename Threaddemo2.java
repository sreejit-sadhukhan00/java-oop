
class A implements Runnable{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println("sreejit");
                Thread.sleep(1000);
               }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Threaddemo2 {
    public static void main(String[] args) {
         A r=new A();
         Thread t=new Thread(r);
         t.start();
             for(int i=0;i<=5;i++){
            System.out.println("main thread");
        }
    }
    
}