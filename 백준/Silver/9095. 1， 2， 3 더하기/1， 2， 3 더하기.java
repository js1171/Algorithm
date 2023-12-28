import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int num =0;
        for (int i=1 ; i <= count ; i++) {
            num = Integer.parseInt(br.readLine());

            for (int j=4 ; j <= num ; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            sb.append(dp[num]).append("\n");
        }
        System.out.println(sb);
    }
}