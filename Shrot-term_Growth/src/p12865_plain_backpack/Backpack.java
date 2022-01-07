package p12865_plain_backpack;

import java.util.Scanner;
import java.util.Vector;

public class Backpack {

    public static void main(String[] args) {
        int N, K;
        Vector<Thing> things = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();

        for (int i = 0 ; i < N ; i++) {
            int w = scanner.nextInt();
            int v = scanner.nextInt();
            things.addElement(new Thing(w, v));
        }

        // 무게 합이 K 이하
//        int wsum=0;
//        for (int i = 0; i < N-1; i++) {
//            things.get(i).getW();
//            if (wsum<=K) {
//
//            }
//
//        }
        // 가치합의 최댓값 <- 각 무게합별로 가치합 저장 후 비교

        // sol2) 가치합의 최댓값을 먼저 찾은 다음에 무게 되는지 비교

        int vmax=0;
        int wsum=0;

        for (int i=0; i<N-1; i++) {
            int vsum=0;
            int v=things.get(i).getV();
            int w=things.get(i).getW();
            vsum+=v+things.get(i+1).getV();
            wsum+=w+things.get(i+1).getW();

            if (wsum <= K && vsum > vmax) {
                vmax=vsum;
            }

            vsum+=v+things.get(i+2).getV();
            wsum+=w+things.get(i+2).getW();
            if (wsum <= K && vsum > vmax) {
                vmax=vsum;
            }
        }

    }
}
