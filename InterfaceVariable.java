interface customerRaj{
     int amt=5;
     void purchase();
}

class sellersanju implements customerRaj{
       public void purchase(){
        System.out.println("Raj needs "+amt+" kg rice");
       }
}


public class InterfaceVariable {
    public static void main(String[] args) {
        customerRaj c=new sellersanju();
        c.purchase();
        // the variable is static
        System.out.println(customerRaj.amt);
    }
}
