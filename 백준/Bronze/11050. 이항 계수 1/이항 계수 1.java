import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = factorial(n) / (factorial(k) * factorial(n-k));

        System.out.println(answer);
    }

    static int factorial(int num) {
        int result = 1;
        for(int i=2 ; i <= num ; i++) {
            result *= i;
        }
        return result;
    }
}