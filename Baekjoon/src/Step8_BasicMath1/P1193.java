package Step8_BasicMath1;

import java.util.Scanner;

// 분수 찾기
public class P1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int n = 1, a = 1, b = 1; // n번째 분수 a/b
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    if (n == x) break;
                    a++;
                    if (b != 1) b--;
                    n++;
//                    System.out.println(n+"번째- "+ "i:"+i + ", j:"+j+" "+ a+"/"+b);
                }
            }
            else {
                for (int j = 0; j < i; j++) {
                    if (n == x) break;
                    b++;
                    if (a != 1) a--;
                    n++;
//                    System.out.println(n+"번째- "+ "i:"+i + ", j:"+j+" "+ a+"/"+b);
                }
            }
        }
        System.out.println(a + "/" + b);

    }
}
