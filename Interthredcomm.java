
class SumDemo extends Thread{
    int sum=0;

    public void run(){
        synchronized(this){
        for(int i=1;i<=50;i++){
            sum=sum+i;
        }
        this.notify();
        // System.out.println(sum);
    
    }
    }
}

public class Interthredcomm {
    public static void main(String[] args)throws InterruptedException {
        SumDemo t=new SumDemo();
        t.start();
           synchronized(t){
            t.wait();
            System.out.println("sum is "+ t.sum);
        }
    }
}
