package Step7_String;

import java.util.Scanner;

// 상수
public class P2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        String snum1 ="";
        for (int i = str1.length(); i > 0 ; i--) {
            snum1 += str1.charAt(i-1);
        }
        String snum2 ="";
        for (int i = str2.length(); i > 0 ; i--) {
            snum2 += str2.charAt(i-1);
        }

        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        if (num1 < num2)
            System.out.println(num2);
        else
            System.out.println(num1);

    }
}
