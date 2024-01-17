import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int[][] arr;
    static int[][] distance;

    static int Y = 0;
    static int X = 0;

    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        arr = new int[X][Y];
        distance = new int[X][Y];

        for(int i=0 ; i < Y ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j < X ; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
                if(arr[j][i]==1) queue.add(new int[] {j, i});
            }
        }

        int day = BFS();

        for(int i=0 ; i < Y ; i++) {
            for(int j=0 ; j < X ; j++) {
                if(arr[j][i]==0) {
                    day = -1;
                    break;
                }
            }
        }

        System.out.println(day);
    }

    public static int BFS() {
        int day=1;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i=0 ; i<4 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx>=0 && ny>=0 && nx<X && ny<Y) {
                    if(arr[nx][ny]==0) {
                        arr[nx][ny] = arr[now[0]][now[1]]+1;
                        day = Math.max(day, arr[nx][ny]);
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
        return day-1;
    }
}