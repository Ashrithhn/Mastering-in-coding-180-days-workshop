import java.util.Scanner;

public class TempConv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double result;
        String unitUser;
        System.out.println("Enter Temperature:");
        temperature = scanner.nextDouble();

        System.out.println("Convert To Celsius or Farehnit:");
        unitUser = scanner.next().toUpperCase();

        result = (unitUser.equals("c")) ? (temperature - 32) * 5 / 9: (temperature * 9/5) + 32;
        System.out.printf("%.2f%s" , result,unitUser);
        scanner.close();

    }
}
