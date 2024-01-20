import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static int[][] visited;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int X, Y;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        arr = new int[X][Y];
        visited = new int[X][Y];

        for(int i=0 ; i<Y ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<X ; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
                visited[j][i] = -1;
            }
        }

        System.out.println(DFS(0,0));

    }

    public static int DFS(int x, int y) {

        if(x==X-1 && y==Y-1) return 1;

        if(visited[x][y] == -1) {
            visited[x][y] = 0;

            for(int i=0 ; i<4 ; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && ny>=0 && nx<X && ny<Y) {
                    if(arr[x][y] > arr[nx][ny]) {
                        visited[x][y] += DFS(nx, ny);
                    }
                }
            }
        }
        return visited[x][y];
    }
}