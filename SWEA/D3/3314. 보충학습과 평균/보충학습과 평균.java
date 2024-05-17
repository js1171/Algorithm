import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int[] arr = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i = 0 ; i < 5 ; i++) {
            	int num = Integer.parseInt(st.nextToken());
                if (num < 40) sum += 40;
                else sum+= num;
            }
            sb.append("#").append(tc).append(" ").append(Math.round(sum/5)).append("\n");
        }
    	System.out.print(sb);
	}
}