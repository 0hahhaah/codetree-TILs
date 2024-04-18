import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int a = sc.nextInt();

        if(s == 0) { //남자
            if( a >= 19) {
                System.out.print("MAN");
            } else {
                System.out.print("BOY");
            }
        } else { //여자
            if(a >= 19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}