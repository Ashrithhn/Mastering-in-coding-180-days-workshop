import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        score = scanner.nextInt();
        String scoreOF = (score >= 80) ? "pass" : "fail";
        System.out.println(scoreOF);
    }
}
