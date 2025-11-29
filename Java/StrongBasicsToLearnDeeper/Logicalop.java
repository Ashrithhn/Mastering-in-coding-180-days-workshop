import java.util.Scanner;
import java.lang.String;

public class Logicalop {
    public static void main(String[] args){

        String userName;
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter your username");
        userName = scanner.nextLine();

        if (userName.length() < 4 || userName.length() > 12) {
            System.out.println("user name must between (4-12) characters");
        }
        else if(userName.contains(" ") || userName.contains("_")){
            System.out.println("username not contain these characters (space and underscore)");
        }
        else
            System.out.println("your user name " + userName);

        }

    }

