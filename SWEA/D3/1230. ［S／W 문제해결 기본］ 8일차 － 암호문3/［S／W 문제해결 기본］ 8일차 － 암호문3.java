import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
        	int secretN = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < secretN ; i++) {
            	list.add(Integer.parseInt(st.nextToken()));
            }
            
            int orderN = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < orderN ; i++) {
            	switch(st.nextToken()) {
                    case "I" : {
                        int idx = Integer.parseInt(st.nextToken());
                        int count = Integer.parseInt(st.nextToken());
                        for (int j = idx ; j < idx + count ; j++) {
                        	list.add(j, Integer.parseInt(st.nextToken()));
                        }
                        break;
                    }
                    case "D" : {
                        int idx = Integer.parseInt(st.nextToken());
                        int count = Integer.parseInt(st.nextToken());
                        for (int j = 0 ; j < count ; j++) {
                        	list.remove(idx);
                        }
                        break;
                    }
                    case "A" : {
                        int count = Integer.parseInt(st.nextToken());
                        for (int j = 0 ; j < count ; j++) {
                        	list.add(Integer.parseInt(st.nextToken()));
                        }
                        break;
                    }
                }
            }
            sb.append("#").append(tc).append(" ");
            for (int i = 0 ; i < 10 ; i++) {
            	sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}