import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for (int i=1 ; i <= count ; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num==0 && pqueue.isEmpty()) System.out.println(0);
            else if (num==0) System.out.println(pqueue.poll());
            else pqueue.add(num);
        }
    }
}