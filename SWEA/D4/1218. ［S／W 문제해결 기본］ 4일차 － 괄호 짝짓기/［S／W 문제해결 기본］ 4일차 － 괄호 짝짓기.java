import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Stack<String> stack = new Stack<>();
            int result = 1;
            for (int i = 0 ; i < num ; i++) {
            	String s = str.substring(i, i + 1);
                if (s.equals("(") || s.equals("{") || s.equals("[") || s.equals("<")) {
                	stack.push(s);
                } else {
                    String popStr = stack.pop();
                    if ((popStr.equals("(") && !s.equals(")")) || (popStr.equals("{") && !s.equals("}")) || (popStr.equals("[") && !s.equals("]")) || (popStr.equals("<") && !s.equals(">"))) {
                    	result = 0;
                        break;
                    }
                }
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
}