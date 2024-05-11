import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            
            sb.append("#").append(tc).append(" ").append("\n");
            int width = 10;
            for (int i = 0 ; i < num ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int count = Integer.parseInt(st.nextToken());
                
                while (count > 0) {
                    while (count > 0 && width > 0) {
                        sb.append(str);
                        count--;
                        width--;
                    }
                    if (width == 0) {
                        sb.append("\n");
                    	width = 10;
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
