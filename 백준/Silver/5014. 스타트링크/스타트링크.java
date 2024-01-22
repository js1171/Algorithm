import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] visited;
    static int lastFloor, targetFloor, count, up, down;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        lastFloor = Integer.parseInt(st.nextToken());
        int currentFloor = Integer.parseInt(st.nextToken());
        targetFloor = Integer.parseInt(st.nextToken());
        up = Integer.parseInt(st.nextToken());
        down = Integer.parseInt(st.nextToken());
        visited = new int[lastFloor+1];

        BFS(currentFloor);
    }

    public static void BFS(int currentFloor) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentFloor);
        visited[currentFloor] = 1;

        while(!queue.isEmpty()) {
            int now = queue.poll();

            if(now==targetFloor) {
                System.out.println(visited[now]-1);
                break;
            }
            if(now+up <= lastFloor && visited[now+up]==0) {
                visited[now+up] = visited[now]+1;
                queue.add(now+up);
            }
            if(now-down > 0 && visited[now-down]==0) {
                visited[now-down] = visited[now]+1;
                queue.add(now-down);
            }
        }
        if(visited[targetFloor]==0) {
            System.out.println("use the stairs");
        }
    }
}