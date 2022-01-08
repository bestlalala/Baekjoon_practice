package Step5_Array1;

import java.util.Scanner;

public class P10818_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++)
            nums[i] = scanner.nextInt();
        scanner.close();

        int min = nums[0];
        int max = nums[N-1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println(min + " " + max);
    }

}
