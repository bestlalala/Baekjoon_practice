package Algorithm.BFS;

import java.util.Scanner;

// 2178번: 미로 탐색
public class P2178 {
    static int n;
    static int m;
    static int[][] maze;
    static boolean[][] visited;
    static int count = 0;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == 1 &&!visited[i][j]) {
                    move(i, j);
                }
            }
        }
        System.out.println(count);
    }

    public static void move(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                    move(nx, ny);
                    count++;
                }
            }
        }

    }
}
