 class Rectangle {
    public int length;
    public int breadth;
  
    public void Draw(){
      System.out.println("Drawing a rectangle");
     }
  
     public void printArea(){
      System.out.println("Area is: "+(length*breadth));
     }
  }

public class EncapsulationTutorial {
     public static void main(String[] args) {
      Rectangle rect1=new Rectangle();
      rect1.length=10;
      rect1.breadth=2;
      rect1.Draw();
      rect1.printArea();
     }
}
