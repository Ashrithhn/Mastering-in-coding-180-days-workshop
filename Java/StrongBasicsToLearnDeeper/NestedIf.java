public class NestedIf {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if(isSenior) {
                System.out.println("you got a senior discount 20%");
                System.out.println("you gota sstudent discount 10%");
                price *= 0.7;
            }
            else {
                System.out.println("you got only student discount 10%");
                price *= 0.9;
            }

        }
        else{
            if (isSenior){
                System.out.println("you got senior discount 20%");
                price *= 0.8;
            }
            else {
                price *= 1;
            }
        }
        System.out.printf("your price is $ is $%.2f",price);


    }
}
