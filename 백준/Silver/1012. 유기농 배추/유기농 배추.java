import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int[][] arr;
    static boolean[][] visited;
    static int X, Y;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int t=0 ; t < testCount ; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            int cabbageCount = Integer.parseInt(st.nextToken());
            int count = 0;

            arr = new int[X][Y];
            visited = new boolean[X][Y];

            for(int i=0 ; i < cabbageCount ; i++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for(int i = 0; i < X; i++) {
                for(int j = 0; j < Y; j++) {
                    if(arr[i][j]==1 && !visited[i][j]) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void DFS(int x, int y) {
        visited[x][y] = true;

        for(int i=0 ; i < 4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < X && ny < Y) {
                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    DFS(nx, ny);
                }
            }
        }
    }
}