package forSentence;

import java.util.Scanner;

/**
 * Baekjoon 단계별로 풀어보기 - for문 2742번. 기찍 N
 */
public class P2742 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = N; i>0; i--) {
            System.out.println(i);
        }
    }
}
