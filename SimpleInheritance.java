class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter roll,name and marks");
    }
}
    class ankit extends student{
             void disp(){
                roll=13;
                name="sreejit";
                marks=88;
                System.out.println(roll+" "+name+" "+marks);
             }
    }



public class SimpleInheritance {
      public static void main(String[] args) {
        ankit ref=new ankit();
        ref.input();
        ref.disp();
      }
}
