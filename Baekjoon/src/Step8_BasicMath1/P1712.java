package Step8_BasicMath1;

import java.util.Scanner;

// 손익분기점
public class P1712 {
    public static void main(String[] args) {
        int n;
        int A, B, C;

        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        if (B >= C)
            System.out.println(-1);
        else {
            n = A / (C - B) + 1;
            System.out.println(n);
        }
    }
}
