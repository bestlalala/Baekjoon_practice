package Step5_Array1;

import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();  //테스트 케이스 수 입력

        int n, sum, cnt;
        double avg; //평균
        double result; //비율

        for (int i = 0; i < c; i++) {
            n = scanner.nextInt();  //학생 수
            int[] arr = new int[n];

            sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                sum+=arr[j];
            }

            avg = (double) sum/n;

            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            result = (double) cnt / n * 100.0;

            System.out.printf("%.3f", result);
            System.out.println("%");
        }
        scanner.close();
    }
}
