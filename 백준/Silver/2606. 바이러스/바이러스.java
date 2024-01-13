import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static int count=0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());

        visited = new boolean[node+1];
        arr = new ArrayList[node+1];
        for(int i=1 ; i < node+1 ; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i=0 ; i < edge ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        DFS(1);
        System.out.println(count-1);
    }

    public static void DFS(int node) {
        if(visited[node]) return;
        visited[node] = true;
        count++;
        for (int i : arr[node]) {
            if(!visited[i]) DFS(i);
        }
    }
}