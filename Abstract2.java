abstract class programming{
    public abstract void Developer();
 }

class HTML extends programming{
    // @Override
    public void Developer(){
        System.out.println("tim berners lee");
    }
}

class JAVA extends programming{
    // @Override
    public void Developer(){
        System.out.println("James Gosling");
    }
}




public class Abstract2 {
    public static void main(String[] args) {
        programming lang1=new HTML();
        lang1.Developer();
        programming lang2=new JAVA();
        lang2.Developer();
    }
}
