import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your day:");
        int day=sc.nextInt();

        // java only supports boolean inside if condition =----> 
        if(day==1){
            System.out.println("Monday");
        }
       else if(day==2){
            System.out.println("Tuesday");
        }
       else if(day==3){
            System.out.println("Wednesday");
        }
       else if(day==4){
            System.out.println("Thursday");
        }
       else if(day==5){
            System.out.println("Friday");
        }
       else if(day==6){
            System.out.println("Satarday");
        }
       else if(day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Enter valid input");
        }

        int a=6;
        int b= (a==6)?1:4;
        
}}
