import java.util.*;
import java.io.*;

class Solution {
    static String[][] arr;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static HashSet<String> hashSet;
    
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
            hashSet = new HashSet<>();
            arr = new String[4][4];
        	for (int i = 0 ; i < 4 ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < 4 ; j++) {
                	arr[i][j] = st.nextToken();
                }
            }
            for (int i = 0 ; i < 4 ; i++) {
            	for (int j = 0 ; j < 4 ; j++) {
                	moveCount(i, j, 1, arr[i][j]);
                }
            }
            sb.append("#").append(tc).append(" ").append(hashSet.size()).append("\n");
        }
        System.out.print(sb);
	}
    static void moveCount(int x, int y, int depth, String str) {
    	if (depth == 7) {
        	hashSet.add(str);
            return;
        }
        for (int i = 0 ; i < 4 ; i++) {
        	int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < 4 && ny < 4) {
            	moveCount(nx, ny, depth + 1, str + arr[nx][ny]);
            }
        }
    }
}