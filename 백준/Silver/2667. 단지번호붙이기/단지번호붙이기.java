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
        visited = new boolean[l][l];

        for(int i=0 ; i < l ; i++) {
            String line = br.readLine();
            for(int j=0 ; j < l ; j++) {
                arr[j][i] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        int count=0;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for(int i=0 ; i < l ; i++) {
            for(int j=0 ; j < l ; j++) {
                if(arr[j][i]==1 && !visited[j][i]) {
                    pqueue.add(bfs(j,i));
                    count++;
                }
            }
        }

        System.out.println(count);
        while(!pqueue.isEmpty()) {
            System.out.println(pqueue.poll());
        }
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        visited[x][y] = true;
        int count=1;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int i=0 ; i<4 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx>=0 && ny>=0 && nx<l && ny<l) {
                    if(arr[nx][ny]==1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        count++;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
        return count;
    }
}