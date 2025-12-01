public class VarArgs {

    public static void main(String[] args){

//        int target  = addNumbers(1,2,7,4);
//        System.out.println(target);

        System.out.println(average());
    }
    static int addNumbers(int... numbers){

        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
       return sum;

    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0) {
            return 0;
        }

        for(double number : numbers){
            sum = sum + number;
        }
        return sum/numbers.length;
    }
}
