import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            sb.append("#").append(tc).append(" ");
        	String str = br.readLine();
            int a = 1, b = 1;
            for (int i = 0 ; i < str.length() ; i++) {
            	String substr = str.substring(i, i+1);
                if (substr.equals("L")) {
                	b += a;
                } else {
                	a += b;
                }
            }
            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.print(sb);
	}
}