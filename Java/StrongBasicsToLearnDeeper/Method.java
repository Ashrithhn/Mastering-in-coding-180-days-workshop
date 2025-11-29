public class Method {

    public static void main (String[] args){

//        happyBirthday("ashrith",18); //argument

//        System.out.println(getFullName("Ashrith", "hn"));

//        System.out.println(ageCheck(20));
        int age  = 7;
        if (ageCheck(age)){
            System.out.println("you can sign up");
        }
        else {
            System.out.println("you are not eighteen plus");
        }





    }
    static <age> void happyBirthday(String name ,int age) { //parameter

        System.out.println("happy birthday");
        System.out.println("your name is " + name);
        System.out.println("Your age is " + age );
        System.out.println();

    }

    static double square(int number){
        return number * number;
    }

    static int cube(int number){
        return number * number * number;
    }

    static String getFullName(String firstname,String lastname) {
        return firstname + " " + lastname;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }

}
//overloaded methods can share same method name but differnt parameter
//exaple addNum(int a, int b){}
//an overloaded method look like addNum(int a ,int b, int c)