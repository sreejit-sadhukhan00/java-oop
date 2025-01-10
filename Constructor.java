class Student {
    int roll;
    String name;
    float marks;

    // Method to print a greeting
    void greeting() {
        System.out.println("Hello, my name is " + name); // Use System.out.println instead of System.err.println
    }

    // Constructor Blueprint of student u can create as many student as u want with this
    Student(int x, String name, float z) {
        this.roll = x;
        this.name = name;
        this.marks = z;
    }
    // constructor overloading
    Student(Student other){
this.name=other.name;
this.roll=other.roll;
this.marks=other.marks;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student rahul = new Student(12, "Rahul", 32.4f); // Ensure 'Rahul' is capitalized as intended
        rahul.greeting();

        Student random=new Student(rahul);
       System.out.println(random.name);
    }
}
