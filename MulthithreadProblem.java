class Bus implements Runnable{
    int available=1,passenger;
    Bus(int passenger){
          this.passenger=passenger;
    }
     @Override
     public synchronized void run() {    //solution 
          String name=Thread.currentThread().getName();
         if (available>=passenger) {
             System.out.println(name+" reserves seat");
             available=available-passenger;
         } else {
          System.out.println("seat not available");
         } 
     }
     
}
public class MulthithreadProblem {
     public static void main(String[] args) {
        Bus r1=new Bus(1);

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        Thread t3=new Thread(r1);

        t1.setName("rammm");
        t2.setName("shyaaaam");
        t3.setName("komlalebu");

      t1.start();
      t2.start();
      t3.start();
     }
}
