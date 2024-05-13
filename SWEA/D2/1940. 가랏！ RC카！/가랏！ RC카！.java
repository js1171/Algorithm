import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int sec = Integer.parseInt(br.readLine());
            
            int dis = 0, speed = 0;
            for (int i = 0 ; i < sec ; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                if (command == 1) {
                	speed += Integer.parseInt(st.nextToken());
                    dis += speed;
                } if (command == 0) {
                	dis += speed;
                } if (command == 2) {
                    int down = Integer.parseInt(st.nextToken());
                	speed = (speed - down < 0) ? 0 : speed - down ;
                    dis += speed;
                }
            }
            sb.append("#").append(tc).append(" ").append(dis).append("\n");
        }
        System.out.print(sb);
	}
}