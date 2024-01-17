import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for(int i=0 ; i < tc ; i++) {
            int num = Integer.parseInt(br.readLine());
            dp = new int[num+1];

            sb.append(fibonacci(num, 0)).append(" ").append(fibonacci(num, 1)).append("\n");
        }
        System.out.println(sb);
    }

    public static int fibonacci(int num, int cNum) {

        if(num==0 && cNum==0) {
            return 1;
        }
        if(num==0 && cNum==1) {
            return 0;
        }

        if(cNum==0) {
            dp[0] = 1;
            dp[1] = 0;
        } else {
            dp[1] = 1;
            dp[0] = 0;
        }

        for(int i=2 ; i <= num ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[num];
    }
}