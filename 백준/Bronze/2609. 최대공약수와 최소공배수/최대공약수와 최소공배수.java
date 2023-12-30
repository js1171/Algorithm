import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int max = Math.max(A,B);
        int min = Math.min(A,B);

        for(int i=min ; i > 0 ; i--) {
            if(A%i==0 && B%i==0) {
                sb.append(i).append("\n");
                break;
            }
        }
        int i = 1;
        while(true) {
            if((max*i) % min ==0) {
                sb.append(max*i);
                break;
            }
            i++;
        }
        System.out.println(sb);
    }
}