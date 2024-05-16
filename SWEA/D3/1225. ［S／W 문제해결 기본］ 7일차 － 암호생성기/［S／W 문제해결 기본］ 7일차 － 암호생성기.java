import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int caseN = Integer.parseInt(br.readLine());
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0 ; i < 8 ; i++) {
            	queue.add(Integer.parseInt(st.nextToken()));
            }
            int minus = 1;
            while (true) {
            	int num = queue.poll() - minus;
                if (num > 0) {
                	queue.add(num);
                    if (minus < 5 ) minus++;
                    else minus = 1;
                } else  {
                	queue.add(0);
                    break;
                }
            }
            sb.append("#").append(caseN).append(" ");
            for (int i = 0 ; i < 8 ; i++) {
            	sb.append(queue.poll()).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}