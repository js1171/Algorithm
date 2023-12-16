import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;

       st = new StringTokenizer(br.readLine());
       int addNum = Integer.parseInt(st.nextToken());
       int findNum = Integer.parseInt(st.nextToken());

       Map<String, String> addList = new HashMap<>();

       for (int i=0 ; i < addNum ; i++) {
           st = new StringTokenizer(br.readLine());
           addList.put(st.nextToken(), st.nextToken());
       }

       String[] answer = new String[findNum];
       for (int i=0 ; i < findNum ; i++) {
           answer[i] = addList.get(br.readLine());
       }

       for (String str : answer) {
           System.out.println(str);
       }
    }
}