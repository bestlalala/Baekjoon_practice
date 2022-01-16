package Step7_String;

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int[] alphabet = new int[26];
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i);
            if ( 'A' <= index && index <= 'Z') //대문자인 경우
                index -= 'A';
            else
                index -= 'a';
            alphabet[index]++;
        }
        int max = -1;
        char result = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0 && alphabet[i] > max) {
                max = alphabet[i];
                index = i + 'A';
                result = (char) index;
            }
            else if (alphabet[i] == max)
                result = '?';
        }

        System.out.println(result);
    }
}
