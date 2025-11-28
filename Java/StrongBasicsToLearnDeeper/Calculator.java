import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validation = true;

        System.out.println("Enter the first operand");
        number1 = scanner.nextDouble();

        System.out.println("Enter an operator(+,-.*,/,^,):");
        operator = scanner.next().charAt(0);

        System.out.println("enter the second operand:");
        number2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
            if (number2 == 0) {
                System.out.println("zero cannot be divided");
                validation = false;
            } else
                result =  number1 / number2;
                                }
            case '^' -> result = Math.pow(number1 ,number2);
            default -> {
                System.out.println("its not what we expected");
                validation = false;
            }


        }
        if(validation){
            System.out.println(result);

        }

        scanner.close();


    }
}
