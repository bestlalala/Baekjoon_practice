package Step7_String;

import java.util.Scanner;

// 그룹 단어 체커
public class P1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            word[i] = scanner.next();
        }
        boolean flag = true; //그룹 단어라면 true
        int cnt = 0; //그룹 단어 개수
        for (int i = 0; i < n; i++) {
            char[] arr = new char[word[i].length()];
            flag = true;
            for (int j = 1; j < word[i].length(); j++){
                String str = String.valueOf(word[i].charAt(j));
                if (word[i].charAt(j)!=word[i].charAt(j-1))
                    if (word[i].substring(0,j-1).contains(str))
                        flag = false;
            }
            if (flag)
                cnt++;
        }
        System.out.println(cnt);
    }
}
