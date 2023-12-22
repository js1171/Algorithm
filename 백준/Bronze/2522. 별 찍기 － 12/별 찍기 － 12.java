import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        String space = " ";
        String star = "*";
        for (int i=1; i <= count ; i++) {
            sb.append(space.repeat(count-i));
            sb.append(star.repeat(i)).append("\n");
        }
        for (int i=count-1; i >=1 ; i--) {
            sb.append(space.repeat(count-i));
            sb.append(star.repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}