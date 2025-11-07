import java.lang.Math;
import java.util.Scanner;


public class MiniProject {
    /*condition asking user guess a number if that number equals
    to the number that generated randomly buy program user will be win
    else give warning your number is large or small if the user number less than
    0 program will be terminated*/

    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        int userNumber = 0;
        int myNumber = 0;

        do {
            myNumber = (int)(Math.random() * 100);

            System.out.println();
            System.out.println("Guess a number:");
            userNumber = tc.nextInt();

            if (myNumber == userNumber){
                System.out.println("HUrray!! you are won");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println("you are number is too large");
            }

            else {
                System.out.println("you are number is too small");
            }



        }while(userNumber >= 0);
        System.out.println("ohh you entered something else");
        System.out.println("this is actual number" + myNumber);



    }
}

