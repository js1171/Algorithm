import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            String[][] arr = new String[8][8];
            for (int i = 0 ; i < 8 ; i++) {
            	String str = br.readLine();
                for (int j = 0 ; j < 8 ; j++) {
                    arr[i][j] = str.substring(j, j + 1);
                }
            }
            sb.append("#").append(tc).append(" ").append(check(arr, num)).append("\n");
        }
        System.out.print(sb);
	}
    static int check(String[][] arr, int num) {
        int result = 0;
    	for (int i = 0 ; i < 8 ; i++) {
        	for (int j = 0 ; j <= 8 - num ; j++) {
                boolean isAvailable = true;
            	for (int k = j, m = 1 ; k < j + (num / 2) ; k++, m += 2) {
                	if (!(arr[i][k].equals(arr[i][k + num - m]))) {
                        isAvailable = false;
                    	break;
                    }
                }
                if (isAvailable) result++;
            }
        }
        for (int i = 0 ; i < 8 ; i++) {
        	for (int j = 0 ; j <= 8 - num ; j++) {
                boolean isAvailable = true;
            	for (int k = j, m = 1 ; k < j + (num / 2) ; k++, m += 2) {
                	if (!(arr[k][i].equals(arr[k + num - m][i]))) {
                    	isAvailable = false;
                    	break;
                    }
                }
                if (isAvailable) result++;
            }
        }
        return result;
    }
}