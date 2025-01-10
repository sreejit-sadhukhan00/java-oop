class A extends Thread{
    @Override
    public void run(){
        // excuted by created thread
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
public class Threaddemo {
    public static void main(String[] args) throws InterruptedException{
        A t1=new A();
        t1.start();
    //  excuted by main thread
        for(int i=1;i<=5;i++){
            System.out.println("kaushambi");
            Thread.sleep(1000);
        }
    }
}
