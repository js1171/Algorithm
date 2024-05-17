import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            
            sb.append("#").append(tc).append(" ");
            if (num1 == num2) sb.append(num3);
            else if (num1 == num3) sb.append(num2);
            else sb.append(num1);
            sb.append("\n");
        }
        System.out.print(sb);
	}
}