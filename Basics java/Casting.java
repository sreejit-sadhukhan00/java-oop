public class Casting {
    public static void main(String[] args) {
        long a=10;
        // TYpe Casting
        // 1>Implicit Casting 
        //  byte>short>int>long>float>double 

    //  2>Explicit Casting
        int b=(int)a;
        int X=Integer.parseInt("5");
        System.out.println(X);

        int l=5;
        float s=7.5f;
        System.out.println(Math.max(s, l));
        System.out.println(Math.min(s, l));
        System.out.println(Math.round(s));
        double random=Math.random();
        System.out.println(Math.floor(random*10));
    }
}
