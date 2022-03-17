package Algorithm.DFS;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// 2606번: 바이러스
public class P2606 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        LinkedList<Integer>[] computers = new LinkedList[n+1];
        boolean[] visited = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            computers[i] = new LinkedList<>();
        }

        for (int i = 0; i < c; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            computers[v1].add(v2);
            computers[v2].add(v1);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(computers[i]);
        }
        virus(1, computers, visited);

        System.out.println(count);
    }

    public static void virus(int computer, LinkedList<Integer>[] computers, boolean[] visited) {
        visited[computer] = true;

        Iterator<Integer> iter = computers[computer].listIterator();
        while (iter.hasNext()) {
            int w = iter.next();
            if (!visited[w]) {
                virus(w, computers, visited);
                count++;
            }
        }
    }
}
