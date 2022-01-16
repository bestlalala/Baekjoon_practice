package Step7_String;

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            String p = "";
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    p += s.charAt(j);
                }
            }
            System.out.println(p);
        }
    }
}
