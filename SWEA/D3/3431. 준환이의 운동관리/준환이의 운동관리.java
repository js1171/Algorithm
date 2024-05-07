import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int sTime = Integer.parseInt(st.nextToken());
            int eTime = Integer.parseInt(st.nextToken());
            int now = Integer.parseInt(st.nextToken());
            
            sb.append("#").append(tc).append(" ");
            if (now < sTime) {
            	sb.append(sTime - now);
            } else if (now > eTime) {
            	sb.append(-1);
            } else {
            	sb.append(0);
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}