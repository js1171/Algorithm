import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            sb.append("#").append(tc).append(" ");
        	int num = Integer.parseInt(br.readLine());
            
            for (int i = 0 ; i < num ; i++) {
            	sb.append("1/" + num).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}