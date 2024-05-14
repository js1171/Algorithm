import java.util.*;
import java.io.*;

class Solution {
    static int sumResult, result;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int numCount = Integer.parseInt(st.nextToken());
            sumResult = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[numCount];
            for (int i = 0 ; i < numCount ; i++) {
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            result = 0;
            count(arr, 0, 0);
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
    static void count(int[] arr, int num, int sum) {
        if (num == arr.length) {
            if (sum == sumResult) result++;
        	return;
        } else {
            count(arr, num + 1, sum);
            count(arr, num + 1, sum + arr[num]);
        }
    }
}