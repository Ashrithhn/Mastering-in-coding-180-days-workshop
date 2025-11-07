import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = 0;

//        System.out.print("name: ");
//        String name = sc.nextLine();
//        System.out.println("entered name is :" + name);
//        do {
//            System.out.println("enter a number greater than 0:");
//            number = sc.nextInt();
//            System.out.println("here is your number " + number);
//
//        } while (number > 0);
//
//        System.out.println("ohh!! your number is less than 0");
        int i = 0;
        while (true) {
            if (i == 3){
                i++;
                continue;

            }
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
     }
}