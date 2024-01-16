import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[][] arr;
    static int nodeCount = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nodeCount = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        arr = new int[nodeCount+1][nodeCount+1];

        for(int i=1 ; i <= edge ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s][e] = arr[e][s] = 1;
        }

        visited = new boolean[nodeCount+1];
        DFS(startNode);

        sb.append("\n");
        visited = new boolean[nodeCount+1];

        BFS(startNode);
        System.out.println(sb);
    }

    public static void DFS(int node) {
        if(visited[node]) return;

        visited[node] = true;
        sb.append(node).append(" ");

        for(int i=1 ; i <= nodeCount ; i++) {
            if(arr[node][i]==1 && !visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()) {
            int num = queue.poll();
            sb.append(num).append(" ");
            for(int i=1 ; i<=nodeCount ; i++) {
                if(arr[num][i]==1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}