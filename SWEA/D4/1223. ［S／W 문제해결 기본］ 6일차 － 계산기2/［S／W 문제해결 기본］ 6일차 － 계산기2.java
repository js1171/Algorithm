import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int len = Integer.parseInt(br.readLine());
            String formula = br.readLine();
            
            // 후위 표기식으로 변환
            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < len ; i++) {
            	String str = formula.substring(i, i+1);
                if (str.equals("+")) {
                	while(!stack.isEmpty()) {
                    	sb.append(stack.pop());
                    }
                    stack.push("+");
                } else if (str.equals("*")) {
                	stack.push("*");
                }
                else {
                	sb.append(str);
                }
            }
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            
            // 결과 계산
            for (int i = 0 ; i < sb.length() ; i++) {
            	String str = sb.substring(i, i+1);
                if (str.equals("+")) {
                	stack.push(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop()) + "");
                } else if (str.equals("*")) {
                	stack.push(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop()) + "");
                } else {
                	stack.push(str);
                }
            }
            System.out.println("#" + tc + " " + stack.pop());
        }
	}
}