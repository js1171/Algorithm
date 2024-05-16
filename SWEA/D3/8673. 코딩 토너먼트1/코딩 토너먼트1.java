import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0 ; i < Math.pow(2, num) ; i++) {
            	queue.add(Integer.parseInt(st.nextToken()));
            }
            sb.append("#").append(tc).append(" ").append(calculate(queue)).append("\n");
        }
        System.out.print(sb);
	}
    static int calculate(Queue<Integer> queue) {
        int result = 0;
    	while (queue.size() > 1) {
        	int a = queue.poll();
            int b = queue.poll();
            result += Math.max(a, b) - Math.min(a, b);
            queue.add(Math.max(a, b));
        }
        return result;
    }
}