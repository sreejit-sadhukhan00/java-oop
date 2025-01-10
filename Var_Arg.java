
class A{
    void Add(int ... a){
         int sum=0;
         for(int x:a){
            sum=sum+x;
         }
         
         System.out.println("Sum of numbers "+sum);

    }
}




public class Var_Arg {
    public static void main(String[] args) {
        A r=new A();
              r.Add();
              r.Add(10);
              r.Add(12,45);
              r.Add(30,10,40);
    }
}
