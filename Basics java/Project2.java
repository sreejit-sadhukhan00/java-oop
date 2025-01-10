import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        // s=ut+1/2at*t
       Scanner sc=new Scanner(System.in);
       double u;
       do{
        System.out.println("Enter the initial velocity: ");
         u=sc.nextDouble();
       }while(u<0);
       double t;
       do{
      System.out.println("Enter the total amount of time: ");
       t=sc.nextDouble();
    }while(t<0);

    double a;
    do{
      System.out.println("Enter The Accelaration: ");
       a=sc.nextDouble();
    }while(a<0);


    double distance=(u*t)+(0.5*a)*Math.pow(t, 2);
     
    System.out.println("The calculated distance is: "+distance);

    }
}
