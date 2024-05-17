import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int numLen = Integer.parseInt(st.nextToken());
            String strNum = st.nextToken();
            Stack<String> stack = new Stack<>();
            for (int i = 0 ; i < numLen ; i++) {
                String str = strNum.substring(i, i + 1);
            	if (!stack.isEmpty() && stack.peek().equals(str)) {
                	stack.pop();
                } else {
                	stack.push(str);
                }
            }
            int num = 0, num2 = 1;
            while (!stack.isEmpty()) {
            	num += Integer.parseInt(stack.pop()) * num2;
                num2 *= 10;
            }
            sb.append("#").append(tc).append(" ").append(num).append("\n");
        }
        System.out.print(sb);
	}
}