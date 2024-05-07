import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int result = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) % 24;
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
}