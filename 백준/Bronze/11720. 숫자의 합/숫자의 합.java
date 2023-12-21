import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int answer = 0;

        for (int i=0 ; i < count ; i++) {
            answer += num.charAt(i)-48;
        }

        System.out.println(answer);
    }
}