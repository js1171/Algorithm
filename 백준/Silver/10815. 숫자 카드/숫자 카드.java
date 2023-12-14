import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 파싱! (여러개 들어올때 잘라주기)
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(bf.readLine());
        for(int i=0 ; i < count ; i++) {
            map.put(st.nextToken(), 0);
        }

        int count1 = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0 ; i < count1 ; i++) {
            if(map.get(st.nextToken())!=null) {
                sb.append("1 ");
            }
            else sb.append("0 ");
        }
        System.out.println(sb.toString());
    }
}