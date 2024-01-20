import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[] visited;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int X, Y;
    static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        arr = new int[X][Y];
        visited = new boolean[26];

        for(int i=0 ; i<Y ; i++) {
            String line = br.readLine();
            for(int j=0 ; j<X ; j++) {
                arr[j][i] = line.charAt(j)-65;
            }
        }
        max=0;
        dfs(0,0,1);
        System.out.println(max);

    }

    public static void dfs(int x, int y, int length) {
        visited[arr[x][y]] = true;
        max = Math.max(max, length);

        for(int i=0 ; i<4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx < X && ny < Y) {
                if(!visited[arr[nx][ny]]) {
                    dfs(nx, ny, length+1);
                }
            }
        }
        visited[arr[x][y]] = false;
    }
}