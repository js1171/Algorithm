import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        visited = new int[100001];

        BFS(N, K);
    }

    public static void BFS(int node, int K) {
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = 1;
        queue.add(node);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == K) {
                System.out.println(visited[now] - 1);
                break;
            }
            if (now-1>=0 && visited[now-1]==0) {
                visited[now - 1] = visited[now] + 1;
                queue.add(now - 1);
            }
            if (now+1<=100000 && visited[now+1]==0) {
                visited[now + 1] = visited[now] + 1;
                queue.add(now + 1);
            }
            if (now*2<=100000 && visited[now*2]==0) {
                visited[now*2] = visited[now] + 1;
                queue.add(now*2);
            }
        }
    }
}