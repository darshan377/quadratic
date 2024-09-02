// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Input a: ");
       double a = sc.nextDouble();
       System.out.println("Input b: ");
       double b = sc.nextDouble();
       System.out.println("Input c: ");
       double c = sc.nextDouble();

       double d = b*b - 4*a*c;

       if(d>0){
           double root1 = (-b + Math.sqrt(d))/2*a ;
           System.out.println("Root 1: "+root1);
           double root2 = (-b - Math.sqrt(d))/2*a ;
           System.out.println("Root 2: "+root2);
       }
       else if(d==0){
           double root = -b/2*a ;
           System.out.println("Root : "+root);
       }
       else{
           System.out.println("no real roots exists!!!");
       }
    }
}