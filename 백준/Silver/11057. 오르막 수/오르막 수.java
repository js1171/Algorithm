import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int mod = 10007;

        int[][] dp = new int[num+1][10];

        for(int i=0 ; i <= 9 ; i++) {
            dp[1][i] = 1;
        }

        for(int i=2 ; i <= num ; i++){
            for (int j=0 ; j <=9 ; j++) {
                for (int k=j ; k <=9 ; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= mod;
                }
            }
        }

        int answer=0;
        for(int i=0 ; i <=9 ; i++) {
            answer += dp[num][i];
        }
        System.out.println(answer%10007);
    }
}