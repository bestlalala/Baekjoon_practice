package Step2_forSentence;

import java.util.Scanner;
import java.util.Vector;

/**
 * Baekjoon 단계별로 풀어보기 - for문 11021번. A+B - 7
 */
public class P11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        Vector<Integer> sum = new Vector<>();
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum.add(A+B);
        }

        for (int i = 0; i < T; i++) {
            System.out.println("Case #"+(i+1)+": " + sum.get(i));
        }
    }
}
