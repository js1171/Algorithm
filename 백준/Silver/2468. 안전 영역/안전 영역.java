import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int l;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        l = Integer.parseInt(br.readLine());

        arr = new int[l][l];
        
        int heightMax = 0;
        for(int i=0 ; i<l ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<l ; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
                heightMax = Math.max(arr[j][i], heightMax);
            }
        }

        int answer = 0;
        for(int h=0 ; h<=heightMax ; h++) {
            visited = new boolean[l][l];
            int count=0;
            for(int i=0 ; i<l ; i++) {
                for(int j=0 ; j<l ; j++) {
                    if(arr[j][i]>h && !visited[j][i]) {
                        dfs(j,i,h);
                        count++;
                    }
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for(int i=0 ; i<4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<l && ny<l) {
                if(arr[nx][ny]>h && !visited[nx][ny]) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}