import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,3,2,1,4,5,6,8,7,9,};
        String[] fruits = {"apple", "mango", "apple","sebu" };

        boolean isfound = false;

        System.out.println("enter what fruit do you need");
        String target = scanner.nextLine();


//        System.out.println(numbers.length);
        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].contains(target)){
                System.out.println("founded at index " + i);
                isfound = true;
                break;
            }
        }
        if(!isfound){
            System.out.println("not found");
        }
    }

}
