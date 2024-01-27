import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Long startNum, endNum;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        startNum = Long.parseLong(st.nextToken());
        endNum = Long.parseLong(st.nextToken());

        System.out.println(bfs());

    }

    // 최단 경로 탐색
    public static int bfs() {
        Queue<Long> queue = new LinkedList<>();
        queue.add(startNum);

        int count=0;
        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i=0 ; i<size ; i++) {
                long now = queue.poll();
                if(now==endNum) return count+1;

                if(now*2<=endNum) queue.add(now*2);
                if(now*10+1<=endNum) queue.add(now*10+1);
            }
            count++;
        }
        return -1;
    }
}