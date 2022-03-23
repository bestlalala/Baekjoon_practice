package Step7_String;

import java.util.Scanner;

// 크로아티아 알파벳
public class P2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatia.length; i++) {
            if (str.contains(croatia[i]))
                str = str.replace(croatia[i], "!");
        }
        System.out.println(str.length());
    }
}
