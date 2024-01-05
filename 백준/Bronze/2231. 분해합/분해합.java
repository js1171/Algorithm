import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int len = String.valueOf(num).length();

        int answer = 0;
        for(int i=num-(9*len) ; i < num ; i++) {
            int j = i;
            int sum = j;

            while(j>0) {
                sum += j%10;
                j /= 10;
            }

            if(sum==num) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}