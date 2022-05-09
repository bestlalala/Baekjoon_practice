package Algorithm.BFS;

import java.util.*;

public class P2606 {
    static int count = 0;
    static LinkedList<Integer>[] computers;
    static boolean[] visited;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        computers = new LinkedList[n+1];
        visited = new boolean[n+1];
        queue = new LinkedList<>();

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

        queue.add(1);
        while(!queue.isEmpty()) {
            int com = queue.poll();
            if (!visited[com])
                virus(com);
        }

        System.out.println(count-1);
    }

    public static void virus(int computer) {
        visited[computer] = true;
        count++;

        Iterator<Integer> iter = computers[computer].listIterator();
        while(iter.hasNext()) {
            int w = iter.next();
            if (!visited[w]&&!queue.contains(w)) {
                queue.add(w);
            }
        }
    }
}
