// throw vs throws

class test{
    void div (int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
}

 public class comparison {
    public static void main(String[] args) throws ArithmeticException {
        test t=new test();
        t.div(8, 0);
        // try{
        //    t.div(9,0);
        // }
        // catch(Exception e){
        //    System.out.println("the of b value is Zero");
        // }

    }
}
