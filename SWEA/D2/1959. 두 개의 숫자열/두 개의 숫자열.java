import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int num1Len = Integer.parseInt(st.nextToken());
            int num2Len = Integer.parseInt(st.nextToken());
            
            // arr1, arr2 정보 저장
            int[] arr1 = new int[num1Len];
            int[] arr2 = new int[num2Len];
            st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < num1Len ; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < num2Len ; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            
            // 최댓값 구하기
            sb.append("#").append(tc).append(" ");
            if (num1Len < num2Len) {
            	sb.append(maxNum(arr1, arr2)).append("\n");
            } else {
            	sb.append(maxNum(arr2, arr1)).append("\n");
            }
        }
        System.out.print(sb);
	}
    
    static int maxNum(int[] arr1, int[] arr2) {
        int result = 0;
    	for (int i = 0 ; i <= arr2.length - arr1.length ; i++) {
            int num = 0;
        	for (int j = i ; j < i + arr1.length ; j++) {
            	num += arr1[j - i] * arr2[j];
            }
            result = Math.max(num, result);
        }
        return result;
    }
}