

public class StringDemo{
    public static void main(String[] args) {
        String b=new String("Yes");
        String a="Value 2";
        String c="This is my test string";
        
        System.out.println(a.contains("al"));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.startsWith("ye"));
        System.out.println(b.endsWith("s"));
        System.out.println(c.indexOf("test"));
        System.out.println(c.replace("test", "final"));
        
    }
}
