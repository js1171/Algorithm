import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] check = new int[31];
        for(int i=1 ; i < 31 ; i++) {
            check[i] = i;
        }

        for(int i=1 ; i < 29 ; i++) {
            check[Integer.parseInt(br.readLine())]=0;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : check) {
            if(i!=0) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}