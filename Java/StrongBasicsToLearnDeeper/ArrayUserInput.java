import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("how much items do you want");
        size = scanner.nextInt();
        scanner.nextLine();


        String[] fruits = new String[size];
        for(int i = 0; i < fruits.length; i++){
            System.out.println("enter a food");
            fruits[i] = scanner.nextLine();


        }
        for(String print : fruits){
            System.out.println();
            System.out.println(print);
        }

    }
}
