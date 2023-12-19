import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();

        while((str=br.readLine())!=null && !str.isEmpty()) {
            st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}