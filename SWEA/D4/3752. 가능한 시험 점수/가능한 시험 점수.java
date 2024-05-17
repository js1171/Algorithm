import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
        
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(0);
            for (int i = 0 ; i < count ; i++) {
            	int num = Integer.parseInt(st.nextToken());
                HashSet<Integer> copySet = (HashSet<Integer>) hashSet.clone();
                Iterator<Integer> iterator = copySet.iterator();
                while(iterator.hasNext()) {
                	hashSet.add(iterator.next() + num);
                }
            }
            sb.append("#").append(tc).append(" ").append(hashSet.size()).append("\n");
        }
        System.out.print(sb);
	}
}