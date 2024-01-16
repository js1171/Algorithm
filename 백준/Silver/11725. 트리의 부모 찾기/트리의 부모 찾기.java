import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] root;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        arr = new ArrayList[count+1];
        root = new int[count+1];
        visited = new boolean[count+1];

        for(int i=0 ; i < count+1 ; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i=1 ; i < count ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for(int i=2 ; i < count+1 ; i++) {
            sb.append(root[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int node) {
        if(visited[node]) return;

        visited[node] = true;
        for(int i : arr[node]) {
            if(!visited[i]) {
                root[i] = node;
                dfs(i);
            }
        }
    }
}