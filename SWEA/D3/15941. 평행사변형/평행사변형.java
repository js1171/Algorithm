import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            int num = Integer.parseInt(br.readLine());
        	sb.append("#").append(tc).append(" ").append(num * num).append("\n");
        }
        System.out.print(sb);
	}
}