import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
            int n2 = 0, n3 = 0, n5 = 0, n7 = 0, n11 = 0;
        	int num = Integer.parseInt(br.readLine());
            
            while(num % 11 == 0) {
                n11++;
                num /= 11;
            } while(num % 7 == 0) {
                n7++;
                num /= 7;
            } while(num % 5 == 0) {
                n5++;
                num /= 5;
            } while(num % 3 == 0) {
                n3++;
                num /= 3;
            } while(num % 2 == 0) {
                n2++;
                num /= 2;
            }
            sb.append("#").append(tc).append(" ").append(n2).append(" ").append(n3).append(" ").append(n5).append(" ").append(n7).append(" ").append(n11).append("\n");
        }
        System.out.print(sb);
	}
}