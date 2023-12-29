import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        for(int i=1 ; i<=count ; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            int x = (n/h)+1;
            int y = n%h;

            if(y==0) {
                x=n/h;
                y=h;
            }
            sb.append(y*100+x).append("\n");
        }
        System.out.println(sb);
    }
}