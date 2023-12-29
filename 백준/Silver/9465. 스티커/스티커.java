import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr;

        for(int i=1 ; i <=count ; i++) {
            int arrLen = Integer.parseInt(br.readLine());
            arr = new int[2][arrLen+1];

            st = new StringTokenizer(br.readLine());
            for(int j=1 ; j <= arrLen ; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int j=1 ; j <= arrLen ; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            }

            for(int k=2; k <= arrLen ; k++) {
               arr[0][k] += Math.max(arr[1][k-1], arr[1][k-2]);
               arr[1][k] += Math.max(arr[0][k-1], arr[0][k-2]);
            }
            sb.append(Math.max(arr[1][arrLen], arr[0][arrLen])).append("\n");
        }
        System.out.println(sb);
    }
}