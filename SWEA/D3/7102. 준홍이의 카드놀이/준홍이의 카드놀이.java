import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int[] arr = new int[n + m + 1];
            int max = 0;
            for (int i = 1 ; i <= n ; i++) {
            	for (int j = 1 ; j <= m ; j++) {
                	arr[i + j]++;
                    if (arr[i + j] > max) max = arr[i + j];
                }
            }
            
            sb.append("#").append(tc).append(" ");
            for (int i = 1 ; i < arr.length ; i++) {
            	if (arr[i] == max) sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}