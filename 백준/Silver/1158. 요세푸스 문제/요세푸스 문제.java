import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numCount = Integer.parseInt(st.nextToken());
        int plus = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();


        for (int i=1 ; i <= numCount ; i++) {
            queue.add(i);
        }

        int[] arr = new int[numCount];
        int arrCount = 0;

        while(queue.size() > 1) {
            for (int i=1 ; i < plus ; i++) {
                queue.add(queue.poll());
            }
            if (!queue.isEmpty()) arr[arrCount++] = queue.poll();
        }
        if (!queue.isEmpty()) arr[arr.length-1] = queue.poll();

        System.out.print("<");
        for(int i=0 ; i < arr.length-1 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1] + ">");
    }
}