import java.util.Scanner;
import java.lang.Math;

public class Hypoteneuse {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         float a;
         float b;
         double c;

         System.out.print("Enter a length of Side A:");
         a = scanner.nextInt();

         System.out.print("enter a length of Side b:");
         b = scanner.nextInt();

         c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

         System.out.printf("The HYPE is %.1fcm" , c);
         scanner.close();
     }
}
