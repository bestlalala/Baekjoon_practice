package Algorithm.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 2667번: 단지번호 붙이기
public class P2667 {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int count;
    static int dx[] = {0, 0, -1, 1}; // 좌우
    static int dy[] = {1, -1, 0, 0}; // 상하

    static ArrayList<Integer> result; // 단지 집의 수를 저장할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 지도의 크기
        map = new int[n][n]; // 2차원 배열
        visited = new boolean[n][n]; // 방문 여부 체크
        count = 0; // 단지 집의 숫자
        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int c : result)
            System.out.println(c);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx>=0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny]==1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                    count++;
                }
            }
        }
    }
}
// 참고: https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-2667%EB%B2%88-%EB%8B%A8%EC%A7%80%EB%B2%88%ED%98%B8%EB%B6%99%EC%9D%B4%EA%B8%B0-%EC%9E%90%EB%B0%94Java
