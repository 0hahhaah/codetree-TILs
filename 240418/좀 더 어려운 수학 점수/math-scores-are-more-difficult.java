import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int am = sc.nextInt();
        int ae = sc.nextInt();

        int bm = sc.nextInt();
        int be = sc.nextInt();

        if(am > bm) {
            System.out.print("A");
        } else if (bm > am) {
            System.out.print("B");
        } else {
            if(ae > be) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }
    }
}