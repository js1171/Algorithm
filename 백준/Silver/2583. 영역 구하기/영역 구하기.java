import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int X, Y;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        int rectangleCount = Integer.parseInt(st.nextToken());

        arr = new int[X][Y];
        visited = new boolean[X][Y];

        for(int i=0 ; i<rectangleCount ; i++) {
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for(int x=sx ; x<ex ; x++) {
                for(int y=sy ; y<ey ; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int count=0;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for(int y=0 ; y < Y ; y++) {
            for(int x=0 ; x < X ; x++) {
                if(arr[x][y]==0 && !visited[x][y]) {
                    count++;
                    pqueue.add(BFS(x,y));
                }
            }
        }

        System.out.println(count);
        while(!pqueue.isEmpty()) {
            System.out.print(pqueue.poll() + " ");
        }
    }

    public static int BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x,y});
        int area=1;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i=0 ; i<4 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx>=0 && ny>=0 && nx<X && ny<Y) {
                    if(arr[nx][ny]==0 && !visited[nx][ny]) {
                        visited[nx][ny]=true;
                        queue.add(new int[] {nx, ny});
                        area++;
                    }
                }
            }
        }
        return area;
    }
}