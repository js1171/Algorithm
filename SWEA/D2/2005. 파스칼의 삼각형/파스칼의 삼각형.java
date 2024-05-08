import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            
            // arr에 파스칼 삼각형 작성
            int[][] arr = new int[num][num];
            for (int i = 0 ; i < num ; i++) {
            	for (int j = 0 ; j <= i ; j++) {
                	if (i == j || j == 0) {
                    	arr[i][j] = 1;
                    } else {
                    	arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }
            
            // 출력할 sb에 작성
            sb.append("#").append(tc).append("\n");
            for (int i = 0 ; i < num ; i++) {
            	for (int j = 0 ; j <= i ; j++) {
                	sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
	}
}