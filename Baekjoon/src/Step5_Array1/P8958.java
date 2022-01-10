package Step5_Array1;

import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //테스트 케이스의 개수
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            int score = 0, sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    score++;
                }
                else {
                    score = 0;
                }
                sum+=score;
            }
            System.out.println(sum);
        }
    }
}
