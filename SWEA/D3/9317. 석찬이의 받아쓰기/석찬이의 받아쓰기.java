import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            sb.append("#").append(tc).append(" ");
        	int strNum = Integer.parseInt(br.readLine());
            String str1 = br.readLine(), str2 = br.readLine();
            int result = 0;
            for (int i = 0 ; i < strNum ; i++) {
            	if (str1.substring(i, i + 1).equals(str2.substring(i, i + 1))) {
                	result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
	}
}