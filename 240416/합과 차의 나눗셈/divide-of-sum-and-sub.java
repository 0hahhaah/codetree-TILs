import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double sum;
        sum= a+b;
        double minus;
        minus  = a-b;
        double res = sum/minus;
        System.out.printf("%.2f",res);
    }
}