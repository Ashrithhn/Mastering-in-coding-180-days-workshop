import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args){

        byte userInput;
        double kg;
        double lbs;

        System.out.println("Weight Conversion Program");

        System.out.println("1.convert lbs to KG");
        System.out.println("2.convert Kg to lbs");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        userInput = scanner.nextByte();

        if (userInput == 1) {
            System.out.println("Enter weight in Kgs:");
            kg = scanner.nextDouble();
            lbs = kg * 2.204622622;

            System.out.println("The new Weight in LBS is" + lbs + "lbs");

        }
        else if(userInput == 2){
                System.out.println("Enter weight in lbs:");
                lbs = scanner.nextDouble();
                kg = lbs * 0.45359237;

                System.out.println("The new Weight in Kg is" + kg + "lbs");


            }
        else {
                System.out.println("enter valid number");
            }
        }
    }
