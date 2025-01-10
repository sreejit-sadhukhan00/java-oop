class shape{
    void draw(){
        System.out.println("cant say shape type");
    }
}
class square extends shape{
    void draw(){
        System.out.println("square shape");
    }
}


public class Method_overriding {
    public static void main(String[] args) {
        shape ref=new square();
        ref.draw();
    }
}
