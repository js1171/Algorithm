import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];
            for (int i = 0 ; i < 100 ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < 100 ; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append("#").append(num).append(" ").append(maxValue(arr)).append("\n");
        }
        System.out.print(sb);
	}
    static int maxValue(int[][] arr) {
    	int maxNum = 0;
        for (int i = 0 ; i < 100 ; i++) {
            int rowSum = 0;
            int columnSum = 0;
        	for (int j = 0 ; j < 100 ; j++) {
            	rowSum += arr[i][j];
                columnSum += arr[j][i];
            }
            maxNum = Math.max(maxNum, Math.max(rowSum, columnSum));
        }
        int rightCross = 0;
        int leftCross = 0;
        for (int i = 0 ; i < 100 ; i++) {
        	rightCross += arr[i][i];
            leftCross += arr[99 - i][i];
        }
        maxNum = Math.max(maxNum, Math.max(rightCross, leftCross));
        return maxNum;
    }
}