import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 0; 
            for (int i = (int)Math.ceil(Math.sqrt(a)) ;  i <= (int)Math.sqrt(b) ; i++) {
            	if (check(i + "") && check(i * i + "")) result++;
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
    static boolean check(String strNum) {
        if (strNum.length() == 1) return true;
    	for (int i = 0 ; i < strNum.length() / 2 ; i++) {
        	if (!strNum.substring(i, i + 1).equals(strNum.substring(strNum.length() - i - 1 , strNum.length() - i))) {
            	return false;
            }
        }
        return true;
    }
    
}