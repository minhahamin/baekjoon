import java.util.Scanner;

public class Main {
    static int[][] graph;
    static int m, n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스의 개수

        for (int testCase = 0; testCase < t; testCase++) {
            m = scanner.nextInt(); // 배추밭의 가로길이
            n = scanner.nextInt(); // 배추밭의 세로길이
            int k = scanner.nextInt(); // 배추의 개수

            graph = new int[m][n]; // 배추밭 그래프 초기화

            // 배추 위치 입력
            for (int i = 0; i < k; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                graph[x][y] = 1;
            }

            int count = 0;
            // 모든 좌표에 대해 DFS 수행하여 연결된 배추 그룹 찾기
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dfs(i, j)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }

    // DFS 메서드로서 연결된 배추 그룹을 찾고 방문한 배추는 0으로 바꿔줌
    public static boolean dfs(int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n) {
            return false;
        }
        if (graph[x][y] == 1) {
            graph[x][y] = 0;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
