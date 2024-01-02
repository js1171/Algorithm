import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i=1 ; i <=count ; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push" : queue.add(Integer.parseInt(st.nextToken())); break;
                case "pop" : sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append("\n"); break;
                case "size" : sb.append(queue.size()).append("\n"); break;
                case "empty" : sb.append(queue.isEmpty() ? 1 : 0).append("\n"); break;
                case "front" : sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n"); break;
                case "back" : sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n"); break;
            }
        }
        System.out.println(sb);
    }
}