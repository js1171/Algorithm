import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[num];
            int calNum = 0;
           	for (int i = 0 ; i < num ; i++) {
            	arr[i] = Integer.parseInt(st.nextToken());
                calNum += arr[i];
            }
            calNum /= num;
            int result = 0;
            for (int i : arr) {
            	if (i <= calNum) result++;
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
}