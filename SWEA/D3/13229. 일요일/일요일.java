import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	String str = br.readLine();
            sb.append("#").append(tc).append(" ");
            switch(str) {
                case "SUN" : sb.append(7); break;
                case "MON" : sb.append(6); break;
                case "TUE" : sb.append(5); break;
                case "WED" : sb.append(4); break;
                case "THU" : sb.append(3); break;
                case "FRI" : sb.append(2); break;
               	case "SAT" : sb.append(1);
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}