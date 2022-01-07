package forSentence.p11022;

import java.util.Scanner;

/**
 * Baekjoon 단계별로 풀어보기 - for문 11022번. A+B - 8
 */
public class AplusB8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }

    }
}
