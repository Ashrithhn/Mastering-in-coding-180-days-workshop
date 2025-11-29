import java.util.Scanner;

public class BankProject {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 1000;
        double deposit;
        double withdraw;
        byte userChoice;
        boolean isRunning = true;

        System.out.println("*****************************");
        System.out.println("WELCOME TO ASHRITH BANKING");
        System.out.println("*****************************");

        while (isRunning) {

            System.out.println("1.BALANCE");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.EXIT");
            System.out.println("*****************************");

            System.out.print("ENTER YOUR CHOICE : ");
            userChoice = scanner.nextByte();

            switch (userChoice) {

                case 1 -> showBalance(balance);
                case 2 -> balance = depositAmount() + balance;
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("ENTER VALID CHOICE");

            }


        }
        System.out.println("*****************************");
        System.out.println("HAVE A NICE DAY COME BACK AGAIN!!");
        System.out.println("*****************************");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("*****************************");
        System.out.printf("$%.3f\n", balance);
        System.out.println("*****************************");

    }

    static double depositAmount() {

        double amount;
        System.out.println("*****************************");
        System.out.println("Enter the amount to be deposit : ");

        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("*****************************");
            System.out.println("Amount Can't be Negative");
            System.out.println("*****************************");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance){

        System.out.println("Enter the Amount to be Withdrawn");
        double amount = scanner.nextDouble();
         if (amount > balance){
             System.out.println("INSUFFICIENT FUNDS");
             return 0;
         }
         else if(amount < 0){
             System.out.println("Amount cant be negative");
             return 0;
         }
         else {
             return amount;
         }
    }
}






