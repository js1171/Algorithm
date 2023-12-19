import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            int num1 = Integer.parseInt(st.nextToken());
            if (num1 == 0 ) break;
            int num = num1+Integer.parseInt(st.nextToken());
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}