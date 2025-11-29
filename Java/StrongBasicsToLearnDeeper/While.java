import java.util.Random;
import java.util.Scanner;

public class While {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempt = 0;
        int randomNumber = random.nextInt(0,10);
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("guess a number between 1 to 10");

        do {
            System.out.println("guess: ");
            guess = scanner.nextInt();
            attempt++;


        }while (guess != randomNumber);

        System.out.println(guess + " correct wow");
        System.out.println(attempt);



//        String name = "";
//        while (name.isEmpty()){
//            System.out.println("enter your name first :");
//            name = scanner.nextLine();
//
//
//        }
//        System.out.println("hai " + name);
    }
}
