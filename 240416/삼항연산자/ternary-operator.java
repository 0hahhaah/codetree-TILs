import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String pf = score == 100 ? "pass" : "fail";

        System.out.println(pf);
    }
}