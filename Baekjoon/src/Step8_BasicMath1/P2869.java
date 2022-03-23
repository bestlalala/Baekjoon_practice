package Step8_BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다
public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());  // A
        int down = Integer.parseInt(st.nextToken()); // B
        int length = Integer.parseInt(st.nextToken()); // V

        int day = (length - down) / (up - down);
        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((length - down) % (up - down) != 0)
            day++;
        System.out.println(day);
    }
}
