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
            
            int candy = 0;
            boolean isAvailable = true;
            if (num3 - 1 > 0 ) {
                if (num3 <= num2) {
                    candy = num2 - (num3 - 1);
                    num2 -= candy;
                }
            } else {
            	isAvailable = false;
            }
            if (num2 - 1 > 0 ) {
                if (num2 <= num1) {
                    candy += num1 - (num2 - 1);
                }
            } else {
            	isAvailable = false;
            }
            sb.append("#").append(tc).append(" ").append(isAvailable ? candy : -1).append("\n");
        }
        System.out.print(sb);
	}
}