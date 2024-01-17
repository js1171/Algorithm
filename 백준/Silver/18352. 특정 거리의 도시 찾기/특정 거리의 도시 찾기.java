import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;

    static int[] distance;
    static PriorityQueue<Integer> answer;

    static int dis;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        dis = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        arr = new ArrayList[node+1];
        visited = new boolean[node+1];
        distance = new int[node+1];
        answer = new PriorityQueue<>();

        for(int i=0 ; i < node+1 ; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i=0 ; i < edge ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
        }

        BFS(start);

        if(answer.isEmpty()) sb.append(-1);
        else {
            while(!answer.isEmpty()) {
                sb.append(answer.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        distance[start] = 0;

        while(!queue.isEmpty()) {
            int num = queue.poll();
            for(int i : arr[num]) {
                if(!visited[i]) {
                    visited[i] = true;
                    distance[i] = distance[num]+1;
                    if(distance[i]==dis) {
                        answer.add(i);
                    }
                    queue.add(i);
                }
            }
        }
    }
}