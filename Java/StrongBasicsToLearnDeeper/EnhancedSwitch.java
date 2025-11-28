import java.util.Scanner;

public class EnhancedSwitch {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day){

            case  "monday" ,"tuesday" ,"thursday", "friday" -> System.out.println("its a weekday");
            case "saturday" , "sunday" -> System.out.println("its a weekend");
            default -> System.out.println(day + "is not a day");
        }

    }
}
