import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        int answer = 0;
        for(int i=1 ; i <=5 ; i++) {
            num = Integer.parseInt(st.nextToken());
            answer += num*num;
        }
        System.out.println(answer%10);
    }
}