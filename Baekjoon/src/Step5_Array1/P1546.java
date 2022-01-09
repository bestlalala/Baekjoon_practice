package Step5_Array1;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        float[] scores = new float[N];
        float max = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > max)
                max = scores[i];
        }

        float sum = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i]/max*100;
            sum += scores[i];
        }
        float avg = sum/N;
        System.out.println(avg);
    }
}