package Step8_BasicMath1;

import java.util.Scanner;

public class P2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] apart = new int[15][15]; // [k][n]
        for (int i = 1; i < 15; i++) {
            apart[i][1] = 1; // k층 1호는 모두 1명
            apart[0][i] = i; // 0층 i호는 i명
        }
        for (int k = 1; k < 15; k++) {
            for (int n = 2; n < 15; n++) {
                apart[k][n] = apart[k][n-1] + apart[k-1][n];
            }
        }
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apart[k][n]);
        }
        sc.close();
    }
}
