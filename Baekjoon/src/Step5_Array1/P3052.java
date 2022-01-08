package Step5_Array1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {
    public static void main(String[] args) {
        // 서로 다른 값이 몇 개 있는지 -> 애초에 중복을 제거하여 저장 -> Set 사용!
        Set<Integer> nums = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nums.add(scanner.nextInt() % 42);
        }
        scanner.close();

        System.out.println(nums.size());
    }
}
