import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int personN = Integer.parseInt(st.nextToken());
            int problemN = Integer.parseInt(st.nextToken());
            
            int[] arr = new int[personN];
            for (int i = 0 ; i < personN ; i++) {
                st = new StringTokenizer(br.readLine());
            	for (int j = 0 ; j < problemN ; j++) {
                	if (Integer.parseInt(st.nextToken()) == 1) {
                    	arr[i]++;
                    }
                }
            }
            Arrays.sort(arr);
            int result = 0;
            for (int i : arr) {
            	if (i == arr[personN - 1]) result++;
            }
            sb.append("#").append(tc).append(" ").append(result).append(" ").append(arr[personN - 1]).append("\n");
        }
        System.out.print(sb);
	}
}