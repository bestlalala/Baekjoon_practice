package Algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2178번: 미로 탐색
public class P2178 {
    static int n;
    static int m;
    static int[][] maze;
    static boolean[][] visited;
    static Queue<Location> queue;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static class Location {
        int row, col, dist;
        public Location(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        visited = new boolean[n][m];
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }
        bfs();
        sc.close();
    }

    public static void bfs() {
        queue.add(new Location(0, 0, 1));
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = location.row + dy[i];
                int nc = location.col + dx[i];

                if (location.row == n-1 && location.col == m-1) {
                    System.out.println(location.dist);
                    return;
                }

                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                    if (maze[nr][nc] == 1 && !visited[nr][nc]) {
                        queue.add(new Location(nr, nc, location.dist+1));
                        visited[nr][nc] = true;
                    }
                }
            }
        }
    }
}
