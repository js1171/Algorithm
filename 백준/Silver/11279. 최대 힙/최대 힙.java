import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();

        for (int i=1 ; i <= count ; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num==0 && pqueue.isEmpty()) list.add(0);
            else if (num==0) list.add(pqueue.poll());
            else pqueue.add(num);
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}