import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static String[][] arr;
    static boolean[][] visited;

    static int count = 0;

    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(br.readLine());

        arr = new String[count][count];
        visited = new boolean[count][count];

        for(int i=0 ; i < count ; i++) {
            String list = br.readLine();
            for(int j=0 ; j < count ; j++) {
                String str = list.substring(j, j+1);
                arr[j][i] = str;
            }
        }

        int countFirst = 0;

        for(int i=0 ; i < count ; i++) {
            for(int j=0 ; j < count ; j++) {
                if(!visited[j][i]) {
                    bfs(j,i);
                    countFirst++;
                }
            }
        }

        int countSecond = 0;
        visited = new boolean[count][count];

        for(int i=0 ; i < count ; i++) {
            for(int j=0 ; j < count ; j++) {
                if(arr[j][i].equals("G")) arr[j][i] = "R";
            }
        }

        for(int i=0 ; i < count ; i++) {
            for(int j=0 ; j < count ; j++) {
                if(!visited[j][i]) {
                    bfs(j,i);
                    countSecond++;
                }
            }
        }
        System.out.println(countFirst + " " + countSecond);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();

            for(int i=0 ; i < 4 ; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx>=0 && ny>=0 && nx < count && ny < count) {
                    if(!visited[nx][ny] && arr[nx][ny].equals(arr[now[0]][now[1]])) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}