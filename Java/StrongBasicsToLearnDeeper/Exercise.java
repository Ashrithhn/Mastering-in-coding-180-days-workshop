import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        String item;
        double price;
        int noOfItem;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("what item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("what is the price for each ?");
        price = scanner.nextFloat();

        System.out.print("How many ?");
        noOfItem = scanner.nextInt();

        total = price * noOfItem;

        System.out.println("you have bought" + noOfItem + item);
        System.out.println("your total is " + total);
        scanner.close();
    }
}
