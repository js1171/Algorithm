import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < 10 ; i++) {
            	int num = Integer.parseInt(st.nextToken());
                while (num > 0) {
                	arr[i] += num % 10;
                    num /= 10;
                }
            }
            Arrays.sort(arr);
            sb.append("#").append(tc).append(" ").append(arr[9]).append(" ").append(arr[0]).append("\n");
        }
        System.out.print(sb);
	}
}