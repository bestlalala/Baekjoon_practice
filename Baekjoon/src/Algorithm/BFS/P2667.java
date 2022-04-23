package Algorithm.BFS;

import java.util.*;

public class P2667 {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Pos> queue;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static ArrayList<Integer> result; // 단지 집의 수를 저장할 배열

    static class Pos {
        int row, col, num;
        public Pos(int row, int col, int num) {
            this.row = row;
            this.col = col;
            this.num = num; // 단지 집의 수 세기(동 번호)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 지도의 크기
        map = new int[n][n]; // 2차원 배열
        visited = new boolean[n][n]; // 방문 여부 체크
        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j])
                    bfs(new Pos(i, j, 1));
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int c : result)
            System.out.println(c);
    }

    public static void bfs(Pos pos1) {
        queue = new LinkedList<>();
        queue.add(pos1);
        visited[pos1.row][pos1.col] = true;
        int count = 0; // 초기화
        int dong = 1;
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
//            System.out.println(pos.row + ", " + pos.col + ", " + pos.num); // test
            for (int i = 0; i < 4; i++) {
                int nr = pos.row + dr[i];
                int nc = pos.col + dc[i];

                if (nr >= 0 && nc >= 0 && nr < n && nc < n) {
                    if (map[nr][nc] == 1 && !visited[nr][nc]) {
                        queue.add(new Pos(nr, nc, ++dong));
                        visited[nr][nc] = true;
                    }
                }
            }
            count = pos.num;
        }
        result.add(count);
    }
}
