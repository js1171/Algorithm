import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int len = Integer.parseInt(br.readLine());
            
            // arr에 배열 정보 저장
            int[][] arr = new int[len][len];
            for (int i = 0 ; i < len ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < len ; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            // 회전 결과 저장
            sb.append("#").append(tc).append("\n").append(rotation(arr, len));
        }
        System.out.print(sb);
	}
    
    static StringBuilder rotation(int[][] arr, int len) {
    	StringBuilder sb = new StringBuilder();
        
        // len 횟수 만큼 실행
        for (int i = 0 ; i < len ; i++) {
        	// 90도 회전 저장
            for (int j = len - 1 ; j >= 0 ; j--) {
            	sb.append(arr[j][i]);
            }
            sb.append(" ");
            // 180도 회전 저장
            for (int j = len - 1 ; j >= 0 ; j--) {
            	sb.append(arr[len - 1 - i][j]);
            }
            sb.append(" ");
            // 270도 회전 저장
            for (int j = 0 ; j < len ; j++) {
            	sb.append(arr[j][len - 1 - i]);
            }
            sb.append("\n");
        }
       return sb;
    }
}