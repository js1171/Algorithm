import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[][] dp = new int[15][15];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());


        for(int i=1 ; i < 15 ; i++) {
            dp[0][i] = i;
        }

        for(int i=0 ; i < count ; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(peopleNum(k,n)).append("\n");
        }
        System.out.println(sb);
    }

    static int peopleNum(int k, int n) {
        for(int i=1 ; i <= k ; i++) {
            for(int j=1 ; j <= n ; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[k][n];
    }
}