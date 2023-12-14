import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i=1 ; i <= num ; i++) {
            queue.add(i);
        }

        while(queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
    }
}