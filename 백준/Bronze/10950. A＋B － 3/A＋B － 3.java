import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[] answer = new int[count];

        for (int i=0 ; i<count ; i++) {
            st = new StringTokenizer(br.readLine());
            answer[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}