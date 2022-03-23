package Algorithm.DFS;

import java.util.*;

//DFS 와 BFS
public class P1260 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색을 시작할 정점의 번호

        boolean visited[] = new boolean[n+1]; // 방문 여부를 검사할 배열

        LinkedList<Integer>[] adjList = new LinkedList[n+1];

        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(adjList[i]); // 방문 순서를 위해 오름차순 정렬
        }
        dfs_list(v, adjList, visited);
        System.out.println("");
        // 방문 검사 배열 초기화
        Arrays.fill(visited, false);
        bfs_list(v, adjList, visited);
    }

    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
        visited[v] = true; // 정점 방문 표시
        System.out.print(v + " "); // 정점 출력

        Iterator<Integer> iter = adjList[v].listIterator(); // 정점 인접리스트 순회
        while (iter.hasNext()) {
            int w = iter.next();
            if (!visited[w]) { // 방문하지 않은 정점이라면
                dfs_list(w, adjList, visited); // 다시 DFS
            }
        }
    }

    public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);

        while (queue.size() != 0) { // 큐가 완전히 빌 때까지 반복
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> iter = adjList[v].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if (!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }
}
