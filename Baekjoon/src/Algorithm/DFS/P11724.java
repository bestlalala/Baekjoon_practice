package Algorithm.DFS;

import java.util.*;

public class P11724 {
    static int count = 0, n;
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];


        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                link(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void link(int idx) {
        visited[idx] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i] == 1)
                link(i);
        }

    }
}
