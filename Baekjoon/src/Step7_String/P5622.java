package Step7_String;

import java.util.Scanner;

// 다이얼
public class P5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String num = "";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    num += 2;
                    count += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    num += 3;
                    count += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    num += 4;
                    count += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    num += 5;
                    count += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    num += 6;
                    count += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    num += 7;
                    count += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    num += 8;
                    count += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    num += 9;
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}