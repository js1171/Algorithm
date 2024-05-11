import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        int[] day = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());
            
            sb.append("#").append(tc).append(" ").append((day[endMonth - 1] + endDay) - (day[startMonth - 1] + startDay) + 1).append("\n");
        }
        System.out.print(sb);
	}
}