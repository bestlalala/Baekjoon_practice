package Step8_BasicMath1;

import java.util.Scanner;

// ACM 호텔
public class P10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            test(h, w, n);
        }
        sc.close();
    }

    public static void test(int h, int w, int n) {
        int floor, room;
        if (n%h == 0) {
            floor = h;
            room = n / h;
        }
        else {
            floor = n % h;
            room = n / h + 1;
        }
        System.out.println(floor*100 + room);
    }
}
