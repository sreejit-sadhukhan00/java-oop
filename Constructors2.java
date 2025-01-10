

class Rectangle {
    public int length;
    public int breadth;

    Rectangle(int x, int y) {
        this.length = x;
        this.breadth = y;
    }

    public void Draw() {
        System.out.println("Drawing a rectangle");
    }

    public void printArea() {
        System.out.println("Area is: " + (length * breadth));
    }
}

public class Constructors2 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 2);
        rect1.Draw();
        rect1.printArea();
    }
}
