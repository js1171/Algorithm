import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    static int[] dy = {1, 1, 1, 0, -1, -1, -1, 0};

    static int[][] arr;
    static boolean[][] visited;

    static int X = 0;
    static int Y = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String lastCheck = "";

        while(!(lastCheck=br.readLine()).equals("0 0")) {
            st = new StringTokenizer(lastCheck);
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            arr = new int[X][Y];
            visited = new boolean[X][Y];

            for(int i=0 ; i < Y ; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0 ; j < X ; j++) {
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            int count=0;

            for(int i=0 ; i < Y ; i++) {
                for(int j=0 ; j < X ; j++) {
                    if(arr[j][i]==1 && !visited[j][i]) {
                        bfs(j, i);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i=0 ; i < 8 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx>=0 && ny>=0 && nx < X && ny < Y) {
                    if(arr[nx][ny]==1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}