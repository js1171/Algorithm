import java.util.*;
import java.io.*;

class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int result;
    
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int caseN = Integer.parseInt(br.readLine());
            int[][] arr = new int[16][16];
            boolean[][] visited = new boolean[16][16];
            int x = 0, y = 0;
            result = 0;
            for (int i = 0 ; i < 16 ; i++) {
            	String str = br.readLine();
                for (int j = 0 ; j < 16 ; j++) {
                	arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
                    if(arr[i][j] == 2) {
                    	x = i;
                        y = j;
                    }
                }
            }
            isAvailable(x, y, arr, visited);
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
	}
    static void isAvailable(int x, int y, int[][] arr, boolean[][] visited) {
    	visited[x][y] = true;
        
        for (int i = 0 ; i < 4 ; i++) {
        	int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < 16 && ny < 16) {
                if (arr[nx][ny] == 3) {
                	result++;
                    return;
                }
            	if (!visited[nx][ny] && arr[nx][ny] == 0) {
                    isAvailable(nx, ny, arr, visited);
                }
            }
        }
    }
}