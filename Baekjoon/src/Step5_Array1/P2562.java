package Step5_Array1;

import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 9;
        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            if (nums[i]>max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
