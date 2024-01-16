import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int relation = Integer.parseInt(br.readLine());

        arr = new ArrayList[person+1];
        visited = new boolean[person+1];
        distance = new int[person+1];

        for(int i=0 ; i < person+1 ; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i=0 ; i < relation ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        System.out.println(bfs(first, second));
    }

    public static int bfs(int first, int second) {
        Queue<Integer> queue = new LinkedList<>();
        distance[first] = 0;
        visited[first] = true;

        queue.add(first);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int i : arr[node]) {
                if(!visited[i]) {
                    distance[i] = distance[node]+1;
                    if(i == second) {
                        return distance[i];
                    }
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return -1;
    }
}