import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[count];
            for (int i = 0 ; i < count ; i++) {
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            sb.append("#").append(tc).append(" ");
            for (int i : arr) {
            	sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}