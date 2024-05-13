import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            int inputNum = Integer.parseInt(br.readLine());
        	boolean[] arr = new boolean[10];
            int x = 1;
            int check = 0;
            while (true) {
            	int num = inputNum * x;
                while (num > 0) {
                    if (!arr[num % 10]) {
                    	arr[num % 10] = true;
                        check++;
                    }
                	num /= 10;
                }
                if (check == 10) break;
                x++;
            }
            sb.append("#").append(tc).append(" ").append(inputNum * x).append("\n");
        }
        System.out.print(sb);
	}
}