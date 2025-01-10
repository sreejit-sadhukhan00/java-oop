import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        // s=ut+1/2at*t
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the initial velocity: ");
      double u=sc.nextDouble();
      System.out.println("Enter the total amount of time: ");
      double t=sc.nextDouble();
      System.out.println("Enter The Accelaration: ");
      double a=sc.nextDouble();
    
      double distance=(u*t)+(0.5*a)*Math.pow(t, 2);

      System.out.println("The calculated distance is: "+distance);

    }
}
