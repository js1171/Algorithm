import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;  // 절댓값이 같은 경우 음수 우선
            }
            return first_abs - second_abs; // 절댓값 작은 데이터 우선
        });

        for(int i=0 ; i < count ; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) {
                if(queue.isEmpty()) sb.append("0\n");
                else {
                    sb.append(queue.poll()).append("\n");
                }
            } else {
                queue.add(num);
            }
        }
        System.out.println(sb);
    }
}