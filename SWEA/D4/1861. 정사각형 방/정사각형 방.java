import java.util.*;
import java.io.*;

class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int deps;
    
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[num][num];
            for (int i = 0 ; i < num ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < num ; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int maxDepth = 0, startNum = 0;
            for (int i = 0 ; i < num ; i++) {
                for (int j = 0 ; j < num ; j++) {
                    deps = 1;
                    findMaxRoot(i, j, 1, arr);
                    if (deps >= maxDepth) {
                        if (deps == maxDepth) {
                        	startNum = Math.min(startNum, arr[i][j]);
                        } else {
                        	startNum = arr[i][j];
                        }
                        maxDepth = deps;
                    }
                }
            }
            sb.append("#").append(tc).append(" ").append(startNum).append(" ").append(maxDepth).append("\n");
        }
        System.out.print(sb);
    }
    static void findMaxRoot(int x, int y, int depth, int[][] arr) {
    	for (int i = 0 ; i < 4 ; i++) {
        	int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr.length) {
            	if (arr[x][y] + 1 == arr[nx][ny]) {
                    deps = Math.max(deps, depth + 1);
                	findMaxRoot(nx, ny, depth + 1, arr);
                }
            }
        }
    }
}