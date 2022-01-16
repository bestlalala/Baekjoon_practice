package Step7_String;

import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) { // 기본값을 -1로 초기화
            arr[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i)-'a';
            if (arr[index] == -1)
                arr[index] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
