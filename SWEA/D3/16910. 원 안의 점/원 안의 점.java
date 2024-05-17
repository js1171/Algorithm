import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            int result = 0;
            for (int x = 0 ; x <= num ; x ++) {
            	for (int y = 0 ; y <= num ; y++) {
                	if ((x * x) + (y * y) <= (num * num)) {
                    	if (x > 0 && y > 0) {
                        	result += 4;
                        } else if (x == 0 && y ==0) {
                        	result++;
                        } else {
                        	result += 2;
                        }
                    }
                }
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
}