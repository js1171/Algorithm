import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCount = Integer.parseInt(br.readLine());

        int[] arr = new int[numCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i < numCount ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i : arr) {
            if(i==num) count++;
        }
        System.out.println(count);
    }
}