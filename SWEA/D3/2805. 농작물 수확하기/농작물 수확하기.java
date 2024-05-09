import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int len = Integer.parseInt(br.readLine());
            int[][] arr = new int[len][len];
            
            // arr에 가치 정보 저장
            for (int i = 0 ; i < len ; i++) {
                String strN = br.readLine();
                for (int j = 0 ; j < len ; j++) {
                    arr[i][j] = Integer.parseInt(strN.substring(j, j+1));
                }
            }
            
            int center = len / 2;
            int benefit = 0, start = 1, end = len - 1;
            // 수익 계산하기
            for (int j = 0 ; j < len ; j++) {
            	benefit += arr[center][j];
            }
            for (int i = 1 ; i <= center ; i++) {
            	for (int j = start ; j < end ; j++) {
                	benefit += arr[center - i][j] + arr[center + i][j];
                }
                start++;
                end--;
            }
            sb.append("#").append(tc).append(" ").append(benefit).append("\n");
        }
        System.out.print(sb);
	}
}