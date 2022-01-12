package Step6_function;

import java.util.Scanner;

public class P1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hansu(n));
        scanner.close();
    }

    public static int hansu(int n) {
        int cnt = 0; // 한수 카운팅

        if (n < 100) {
            return n;
        }
        else {
            cnt = 99;
            if (n == 1000) {    // 예외처리 필수
                n = 999;
            }
        }

        for (int i = 100; i <= n; i++) {
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            if ((hun - ten) == (ten - one))
                cnt++;
        }
        return cnt;
    }
}
