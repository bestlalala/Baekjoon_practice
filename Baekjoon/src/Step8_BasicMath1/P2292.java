package Step8_BasicMath1;

import java.util.Scanner;

// 벌집
public class P2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int room = 1;
        int x = 1;
        for (int i = 1; n > x ; i++ ) {
            x += i*6;
            room++;
        }
        System.out.println(room);
    }
}
