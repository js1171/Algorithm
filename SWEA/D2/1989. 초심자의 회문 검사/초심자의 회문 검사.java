import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	String str = br.readLine();
            int isTrue = 1;
            for (int i = 0 ; i < str.length() / 2 ; i++) {
            	if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                	isTrue = 0;
                    break;
                }
            }
            sb.append("#").append(tc).append(" ").append(isTrue).append("\n");
        }
        System.out.print(sb);
	}
}