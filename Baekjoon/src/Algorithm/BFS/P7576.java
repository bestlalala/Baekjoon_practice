package Algorithm.BFS;

import java.util.Scanner;

// 7576번 토마토
public class P7576 {
    static int m, n;
    static int[][] box;
    static boolean[][] visited;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};

    static class Pos {
        int row, col;
        public Pos(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc. nextInt();
        n = sc.nextInt();


        box = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[n][m] = sc.nextInt();
            }
        }

        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[n][m] == 1) {
                    isEmpty = false;
                    bfs(new Pos(n, m));
                }
            }
        }

        sc.close();
    }

    public static void bfs(Pos pos) {
        visited[pos.row][pos.col] = true;

        for (int i = 0; i < 4; i++) {
            int nr = pos.row + dr[i];
            int nc = pos.col + dc[i];

            if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                if (box[nr][nc] == 0 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                }
            }
        }
    }
}
