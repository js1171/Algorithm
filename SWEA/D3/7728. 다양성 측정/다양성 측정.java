import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            int[] arr = new int[10];
            int result = 0;
            while (num > 0) {
            	if (arr[num % 10] == 0) {
                	result++;
                    arr[num % 10] = 1;
                }
                num /= 10;
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
}