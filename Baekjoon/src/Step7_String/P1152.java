package Step7_String;

import java.util.Scanner;
import java.util.StringTokenizer;

// 단어의 개수
public class P1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        int count = tokenizer.countTokens();

        System.out.println(count);
    }
}
