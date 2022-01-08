package Step5_Array1;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int[] nums = new int[10];
        int result = a*b*c;

        while (result!=0) {
            int r = result%10;
            nums[r]++;
            result/=10;
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
