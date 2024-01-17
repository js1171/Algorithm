import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static boolean[][] visited;
    static int[][] arr;
    static int[][] distance;

    static int Y = 0;
    static int X = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        arr = new int[X][Y];
        visited = new boolean[X][Y];
        distance = new int[X][Y];

        int oneX = 0;
        int oneY = 0;

        for(int i=0 ; i < Y ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j < X ; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
                if(arr[j][i]==2) {
                    oneX = j;
                    oneY = i;
                }
            }
        }

        BFS(oneX, oneY);

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i < Y ; i++) {
            for(int j=0 ; j < X ; j++) {
                if(!visited[j][i] && arr[j][i]==1) {
                    distance[j][i] = -1;
                }
            }
        }

        for(int i=0 ; i < Y ; i++) {
            for(int j=0 ; j < X ; j++) {
                sb.append(distance[j][i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        visited[x][y] = true;
        distance[x][y] = 0;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i=0 ; i<4 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx>=0 && ny>=0 && nx < X && ny < Y) {
                    if(!visited[nx][ny] && arr[nx][ny]==1) {
                        visited[nx][ny] = true;
                        distance[nx][ny] = distance[now[0]][now[1]] + 1;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}