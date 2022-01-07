package Step2_forSentence;

import java.util.Scanner;

/**
 * Baekjoon 단계별로 풀어보기 - for문 2741번. N 찍기
 */
public class P2741 {

    public static void main(String[] args) {
        int N;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println(i);
        }
    }
}
