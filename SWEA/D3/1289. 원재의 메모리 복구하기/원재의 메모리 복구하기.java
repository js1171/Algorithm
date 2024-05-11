import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	String strNum = br.readLine();
            int[] arr = new int[strNum.length()];
            
            for (int i = 0 ; i < strNum.length() ; i++) {
            	arr[i] = Integer.parseInt(strNum.substring(i, i+1));
            }
            
            // 0에서 num까지 바꾸는데 필요한 횟수 구하기
            sb.append("#").append(tc).append(" ").append(changeNum(arr)).append("\n");
        }
        System.out.print(sb);
	}
    
    static int changeNum(int[] arr) {
        int result = 0;
    	for (int i = 0 ; i < arr.length ; i++) {
           	if (arr[i] == 1) {
            	for (int n = i ; n < arr.length ; n++) {
                    arr[n] = (arr[n] == 1) ? 0 : 1;
                }
                result++;
            }
        }
        return result;
    }
}