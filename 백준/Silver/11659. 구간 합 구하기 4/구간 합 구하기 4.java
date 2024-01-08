import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrNum = Integer.parseInt(st.nextToken());
        int qNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] S = new long[arrNum+1];

        for(int i=1 ; i <= arrNum ; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<qNum ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            sb.append(S[e] - S[s-1]).append("\n");
        }
        System.out.println(sb);
    }
}