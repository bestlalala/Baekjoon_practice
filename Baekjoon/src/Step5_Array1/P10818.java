package Step5_Array1;

import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int min = 0, max = 0;

        for (int i = 0; i < N; i++) {
            int m = scanner.nextInt();

            if (i==0) {
                min = m;
                max = m;
            }
            if (m < min)
                min = m;
            if (m > max)
                max = m;
        }
        scanner.close();

        System.out.println(min + " " + max);
    }

}
