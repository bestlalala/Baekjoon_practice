package Algorithm.DFS;

import java.util.Scanner;

// 1012번: 유기농 배추
public class P1012 {
    static Scanner sc = new Scanner(System.in);
    static int count;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        int t = sc.nextInt(); // 테스트 케이스 수
        for (int i = 0; i < t; i++) {
            test();
        }

    }

    public static void test() {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] map = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
        }

        count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    countWorm(i, j, map, visited);
                }
            }
        }
        System.out.println(count);
    }

    public static void countWorm(int x, int y, int[][] map, boolean[][] visited) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < map.length && ny < map[0].length) {
                if (map[nx][ny]==1 && !visited[nx][ny]) {
                    count++;
                    countWorm(nx, ny, map, visited);
                }
            }
        }
    }
}
