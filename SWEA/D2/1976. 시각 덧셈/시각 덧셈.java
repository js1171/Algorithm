import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int hour = 0, minute = 0;
            hour += Integer.parseInt(st.nextToken());
            minute += Integer.parseInt(st.nextToken());
            hour += Integer.parseInt(st.nextToken());
            minute += Integer.parseInt(st.nextToken());

            if (minute >= 60) {
            	hour++;
                minute -= 60;
            }
            hour = (hour%12) == 0 ? 12 : hour%12;
            
            sb.append("#").append(tc).append(" ").append(hour).append(" ").append(minute).append("\n");
        }
        System.out.print(sb);
	}
}