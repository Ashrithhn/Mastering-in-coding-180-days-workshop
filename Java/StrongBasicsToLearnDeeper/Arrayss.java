import java.util.Arrays;
public class Arrayss {

    public static void main(String[] args){

        String[] fruit = {"apple", "mango" ,"pineapple"};
        double length = fruit.length;
        fruit[2] = "banana";
        System.out.println(fruit[2]);
        System.out.println(length);
        Arrays.fill(fruit,"fruitsss");
        for (int i = 0; i < fruit.length; i++){
            System.out.println(fruit[i]);
        }
        System.out.println();




        //for each loop
        //enhanced for loop
        Arrays.sort(fruit);

        for(String name:fruit){
            System.out.println(name);
        }
    }
}
