package Step4_whileSentence;

import java.util.Scanner;

public class P10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A+B);
        }
        scanner.close();
    }
}
