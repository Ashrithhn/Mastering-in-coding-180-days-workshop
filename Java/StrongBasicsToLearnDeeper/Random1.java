import java.util.Random;
public class Random1 {

    public static void main(String[] args) {

        Random random = new Random();

//        int number;
//        number = random.nextInt(1,4);
//        System.out.println(number);

        boolean isheads = random.nextBoolean();

        if (isheads) {
            System.out.println("heads");
        } else
            System.out.println("tail");
//        System.out.println(isheads);
    }
}