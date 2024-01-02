import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        int count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0 ; i < count ; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.getOrDefault(num,0)==0) map.put(num, 1);
            else map.put(num, map.get(num)+1);
        }

        count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0 ; i<count ; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num,0)).append(" ");
        }
        
        System.out.println(sb);
    }
}