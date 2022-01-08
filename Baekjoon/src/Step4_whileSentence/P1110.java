package Step4_whileSentence;

import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = N;
        int cnt = 0;

        while (true) {
            int a = num/10; //십의 자리 숫자
            int b = num%10; //일의 자리 숫자
            num = 10*b + (a+b)%10;
            cnt++;
            if (num == N) break;
        }
        System.out.println(cnt);
    }
}
