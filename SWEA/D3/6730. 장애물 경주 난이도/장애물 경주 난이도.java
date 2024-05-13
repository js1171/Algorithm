import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int blockNum = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int up = 0;
            int down = 0;
            int beforeNum = Integer.parseInt(st.nextToken());
            for (int i = 1 ; i < blockNum ; i++) {
                int num = Integer.parseInt(st.nextToken());
            	if (beforeNum <= num && up < num - beforeNum) {
                	up = num - beforeNum;
                }
                if (beforeNum >= num && down < beforeNum - num) {
                	down = beforeNum - num;
                }
                beforeNum = num;
            }
            sb.append("#").append(tc).append(" ").append(up).append(" ").append(down).append("\n");
        }
        System.out.print(sb);
	}
}