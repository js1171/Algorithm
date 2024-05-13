import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	String str = br.readLine();
            sb.append("#").append(tc).append(" ");
            for (int i = 0 ; i < str.length() ; i++) {
            	String substr = str.substring(i, i+1);
                if (substr.equals("a") || substr.equals("e") || substr.equals("i") || substr.equals("o") || substr.equals("u")) {
                	continue;
                } else {
                	sb.append(substr);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}