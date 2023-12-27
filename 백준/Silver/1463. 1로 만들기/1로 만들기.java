import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int[num+1];
        System.out.println(minCount(num));
    }

    static int minCount(int num) {
        for(int i=2 ; i <= num ; i++) {
            dp[i] = dp[i-1]+1;
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }
        return dp[num];
    }
}