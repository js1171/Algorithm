import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            
            int[][] arr = new int[100][100];
            for (int i = 0 ; i < num ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < num ; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append("#").append(tc).append(" ").append(move(arr)).append("\n");
        }
        System.out.print(sb);
	}
    static int move(int[][] arr) {
        int count = 0;
    	for (int j = 0 ; j < arr.length ; j++) {
            Stack<Integer> stack = new Stack<>();
        	for (int i = 0 ; i < arr.length ; i++) {
            	if (arr[i][j] == 1) {
                    stack.push(1);
                } else if (arr[i][j] == 2 && !stack.isEmpty()) {
                    if (stack.peek() == 1) count++;
                    stack.push(2);
                }
            }
        }
        return count;
    }
}