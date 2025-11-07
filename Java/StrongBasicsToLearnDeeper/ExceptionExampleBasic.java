public class ExceptionExampleBasic {
    public static void main (String[] args){
        int[] array = {23,45,68};

        try {
            System.out.println(array[4]);
        } catch(Exception exception){

        }
        System.out.println("hello java i go through exception");
    }
}
