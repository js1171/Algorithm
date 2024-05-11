import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int money = Integer.parseInt(br.readLine());
            
            // 돈 나누기
            int[] arr = divideMoney(money);
            
            // 출력
            sb.append("#").append(tc).append("\n");
            for (int i : arr) {
            	sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
    
    static int[] divideMoney(int money) {
        int[] arr = new int[8];
        if (money >= 50000) {
            arr[0] = money / 50000;
            money %= 50000;
        }
        if (money >= 10000) {
            arr[1] = money / 10000;
            money %= 10000;
        }
        if (money >= 5000) {
            arr[2] = money / 5000;
            money %= 5000;
        }
        if (money >= 1000) {
            arr[3] = money / 1000;
            money %= 1000;
        }
        if (money >= 500) {
            arr[4] = money / 500;
            money %= 500;
        }
        if (money >= 100) {
            arr[5] = money / 100;
            money %= 100;
        }
        if (money >= 50) {
            arr[6] = money / 50;
            money %= 50;
        }
        arr[7] = money / 10;
        return arr;
    }
}