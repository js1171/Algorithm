import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    public static int X, Y;

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        // 출발지와 도착지가 같은 경우
        if(X==1 && Y==1) {
            System.out.println(1);
            System.exit(0);
        }

        // 입력값 배열에 저장
        arr = new int[X][Y];
        for(int i=0 ; i<Y ; i++) {
            String line = br.readLine();
            for(int j=0 ; j<X ; j++) {
                arr[j][i] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        System.out.println(bfs());

    }

    // 최단 경로 탐색
    public static int bfs() {
        // 방문 체크하는 3차원 배열
        int[][][] visited = new int[2][X][Y];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0,0});
        visited[0][0][0] = 1;

        while(true) {
            if(queue.isEmpty()) return -1;

            int[] now = queue.poll();
            int w = now[0];
            int x = now[1];
            int y = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = now[1] + dx[i];
                int ny = now[2] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < X && ny < Y) {
                    // 다음 노드가 벽이 아닐 때
                    if (arr[nx][ny]==0 && visited[w][nx][ny]==0) {
                        queue.add(new int[] {w,nx,ny});
                        visited[w][nx][ny] = visited[w][x][y] + 1;
                        if(nx==X-1 && ny==Y-1) {
                            return visited[w][nx][ny];
                        }
                    }

                    // 다음 노드가 벽일 때
                    if(w==0 && visited[1][nx][ny]==0) {
                        queue.add(new int[] {1, nx, ny});
                        visited[1][nx][ny] = visited[0][x][y]+1;
                        if(nx==X-1 && ny==Y-1) {
                            return visited[1][nx][ny];
                        }
                    }
                }
            }

        }
    }
}