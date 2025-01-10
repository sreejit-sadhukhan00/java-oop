class student{
    int age , id;
    String name;
    void show(){
        System.out.println("name"+name +" age"+age);
    }
}


public class test4 {
    public static void main(String[] args) {
        student a=new student();
        a.age=19;
        a.name="ramesh";
       a.show();
    }
}
