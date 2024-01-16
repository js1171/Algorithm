import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static boolean[][] visited;
    static int[][] a;
    static int Y, X;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        a = new int[Y][X];
        visited = new boolean[Y][X];

        for(int i = 0; i<Y; i++) {
            String line = br.readLine();
            for(int j = 0; j<X; j++) {
                a[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(a[Y-1][X-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            for(int k=0 ; k<4; k++) {
                int y = now[0] + dy[k];
                int x = now[1] + dx[k];
                if(x >= 0 && y>=0 && x < X && y < Y) {
                    if(a[y][x]!=0 && !visited[y][x]) {
                        visited[y][x] = true;
                        a[y][x] = a[now[0]][now[1]] + 1;
                        queue.add(new int[] {y,x});
                    }
                }
            }
        }
    }
}